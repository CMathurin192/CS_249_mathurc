package edu.mathurc.assign06;
import java.util.*;
import java.io.PrintWriter;
import edu.mathurc.assign04.GameBoard;

public class GameState implements Loadable {
    private List<Loadable> loadableObjects;
    private GameBoard map;

    public GameState() {
        this.loadableObjects = new ArrayList<>();
        this.map = new GameBoard(12, 30, '.');
    }

    public Loadable createLoadable(String typeName) throws GameFileException {
        if(typeName.equals("Skeleton")) {
            return new Skeleton();
        }
        else if(typeName.equals("Rat")) {
            return new Rat();
        }
        else if(typeName.equals("Item")) {
            return new Item();
        }
        else if(typeName.equals("Tome")) {
            return new Tome();
        }
        else {
            throw new GameFileException("Unknown type: " + typeName);
        }
    }

    public void load(Scanner input) throws GameFileException {
        map.clear();
        loadableObjects.clear();
        int numLines = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numLines; i++) {
            String typeName = input.next();
            Loadable obj = createLoadable(typeName);
            obj.load(input);
            loadableObjects.add(obj);

            if (obj instanceof Drawable) {
                ((Drawable) obj).draw(map);
            }
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("MAP:\n");
        result.append(map.getBoardString()).append("\n");

        result.append("CREATURES:\n");
        for (Loadable obj : loadableObjects) {
            if (obj instanceof Creature) {
                result.append("* ").append(obj).append("\n");
            }
        }

        result.append("INVENTORY:\n");
        for (Loadable obj : loadableObjects) {
            if (obj instanceof Item) {
                result.append("* ").append(obj).append("\n");
            }
        }

        return result.toString();
    }

    public void save(String filename) throws GameFileException {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.print(this);
        } catch (Exception e) {
            throw new GameFileException("Failed to save file!", e);
        }
    }
}
