package edu.mathurc.assign03;

public class GreetingCard {
    private String[] lines;
    private char boundaryChar;

    public GreetingCard(String[] lines, char boundaryChar) {
        setLines(lines);
        this.boundaryChar = boundaryChar;
    }

    public char getBoundaryChar() {
        return boundaryChar;
    }

    public String getLines() {
        StringBuilder string_building = new StringBuilder();
        for (String line : lines) {
            string_building.append(line).append("\n");
        }
        return string_building.toString();
    }

    public void setBoundaryChar(char boundaryChar) {
        this.boundaryChar = boundaryChar;
    }

    public void setLines(String[] lines) {
        this.lines = new String[lines.length];
        System.arraycopy(lines, 0, this.lines, 0, lines.length);
    }

    public String generateBoundaryLine() {
        return String.valueOf(boundaryChar).repeat(50) + "\n";
    }

    public String generateCenteredLine(String text) {
        if (!text.isEmpty()) {
            text = " " + text + " ";
        }

        int paddingNeeded = 50 - text.length();
        int halfPadding = paddingNeeded / 2;
        return String.valueOf(boundaryChar).repeat(halfPadding) +
                text +
                String.valueOf(boundaryChar).repeat(paddingNeeded - halfPadding) +
                "\n";
    }

    public String toString() {
        StringBuilder string_building = new StringBuilder();

        for (int i = 0; i < lines.length; i += 5) {
            if (i > 0) {
                string_building.append("\n");
            }

            string_building.append(generateBoundaryLine());
            string_building.append(generateBoundaryLine());

            int linesToPrint = Math.min(5, lines.length - i);
            for (int j = 0; j < linesToPrint; j++) {
                string_building.append(generateCenteredLine(lines[i + j]));
            }

            for (int j = 0; j < 5 - linesToPrint; j++) {
                string_building.append(generateBoundaryLine());
            }

            string_building.append(generateBoundaryLine());
            string_building.append(generateBoundaryLine());
        }

        return string_building.toString();
    }
}

