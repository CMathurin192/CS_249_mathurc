package edu.mathurc.exercises03;
import java.util.*;

public class SimpleOregon {
    public static void main(String [] args) {
        System.out.println("WELCOME!");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter food:");
        double totalFood = input.nextDouble();
        System.out.println("Enter food:");
        int numPeople = input.nextInt();
        System.out.println("Enter food:");
        int ration = input.nextInt();

        int totalDays = totalFood/(numPeople * ration);

        System.out.println("TOTAL DAYS: " + totalDays);
    }
}
