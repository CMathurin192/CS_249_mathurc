public class GreetingCard {
    public GreetingCard(String[] lines, char boundaryChar) {
        char boundary_char = boundaryChar;
    }

    public char getBoundaryChar() {
        return boundary_char;
    }

    public String getLines() {
        for(int i = 0; i < 5; i++) {
            String single_line = lines[i] + "\n";
        }
        return single_line;
    }

    public void setBoundaryChar(char boundaryChar) {
        char boundary_char = boundaryChar;
        return;
    }

    public String setLines(String [] lines) {

    }

    public String generateBoundaryLine() {
        return (String)(boundary_char * 50);
    }

    public String generateCenteredLine(String text) {
        if(text.length() > 0) {
            text = " " + text + " ";
            int total_padding =
        }

    }

}
