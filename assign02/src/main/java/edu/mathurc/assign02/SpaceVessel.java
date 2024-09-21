package edu.mathurc.assign02;

public class SpaceVessel {
    private String vesselName = "";
    private int length = 0;
    private int weight = 0;

    public String getName() {
        return vesselName;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        vesselName = name;
    }

    public void setLength(int feet) {
        length = feet;
    }

    public void setWeight(int pounds) {
        weight = pounds;
    }

    public String getLengthString() {
        double length_in_meters = length * 0.3048;
        String length_conversion = length + " ft. (" + String.format("%.2f", length_in_meters) + " m)";
        return length_conversion;
    }

    public String getWeightString() {
        double weight_in_kilograms = weight * 0.4536;
        String weight_conversion = weight + " lbs. (" + String.format("%.2f", weight_in_kilograms) + " kg)";
        return weight_conversion;
    }

    public String toString() {
        String final_string = "NAME: " + vesselName + "\n" + "LENGTH: " + getLengthString() + "\n" + "WEIGHT: " +
                getWeightString() + "\n";
        return final_string;
    }
}
