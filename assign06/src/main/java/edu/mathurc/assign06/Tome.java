package edu.mathurc.assign06;
import java.util.Scanner;

public class Tome extends Item {
    private String skill;

    public Tome() {
        this.skill = "";
    }

    public Tome(String ID, int value, String skill) {
        super(ID, value);
        this.skill = skill;
    }

    public String getSkill() {
        return this.skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void read() {
        System.out.println("Skill " + this.skill + " increased!");
    }

    public String toString() {
        return super.toString() + ", enhances " + this.skill;
    }

    public void load(Scanner input) throws GameFileException {
        try {
            super.load(input);
            this.skill = input.next();
        }
        catch(Exception e) {
            setID("");
            setValue(0);
            this.skill = "";
            throw new GameFileException("Error loading Tome", e);
        }
    }
}
