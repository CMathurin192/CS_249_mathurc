package edu.mathurc.assign02;

import java.util.*;

public class Armada {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        SpaceVessel vessel = new SpaceVessel();

        System.out.println("Enter vessel name:");
        String vessel_name = input.nextLine();
        System.out.println("Enter length and weight:");
        String length_and_weight = input.nextLine();

        Scanner parseLine = new Scanner(length_and_weight);
        int length_in_feet = parseLine.nextInt();
        int weight_in_pounds = parseLine.nextInt();

        vessel.setName(vessel_name);
        vessel.setLength(length_in_feet);
        vessel.setWeight(weight_in_pounds);

        String final_string = vessel.toString();
        System.out.println(final_string);
    }
}

