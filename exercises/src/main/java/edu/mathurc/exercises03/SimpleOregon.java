package edu.mathurc.exercises03;

public class SimpleOregon {
    public static void main(String [] args) {
        System.out.println("WELCOME!");

        int totalFood = 200;
        int numPeople = 5;
        int ration = 2;

        int totalDays = totalFood/(numPeople * ration);

        System.out.println("TOTAL DAYS: " + totalDays);
    }
}
