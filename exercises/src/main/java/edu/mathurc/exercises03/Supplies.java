package edu.mathurc.exercises03;

public class Supplies {
    private double totalFood;

    public double getTotalFood() {
        return totalFood;
    }

    public double addFood(double foodInc) {
        if(foodInc >= 0) {
            totalFood += foodInc;
            return foodInc;
        }
        return 0;
    }

    public double removeFood(double foodDec) {
        if(foodDec >= 0) {
            totalFood -= foodDec;
            return foodDec;
        }
    }

    public String toString() {
        String s = "";
        s += "** SUPPLIES*********************************";
        s += "* Food: " + getTotalFood() + "\n";
        s += "***************************************\n";
        return s;
    }
}
