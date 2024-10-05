package edu.mathurc.assign03;

import java.util.Scanner;

public class Hallmark {
    public static GreetingCard generateCard(Scanner input) {
        System.out.println("Enter boundary character:");
        char boundaryChar = input.nextLine().charAt(0);

        System.out.println("Enter number of lines:");
        int numLines = Integer.parseInt(input.nextLine());

        String[] allLines = new String[numLines];
        System.out.println("Enter lines:");
        for (int i = 0; i < numLines; i++) {
            allLines[i] = input.nextLine();
        }

        return new GreetingCard(allLines, boundaryChar);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GreetingCard card = generateCard(input);

        System.out.println("For any occasion:");
        System.out.println(card);
    }
}
