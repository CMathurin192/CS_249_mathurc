package edu.mathurc.exercises00;

public class Nothing {
    public static void main(String [] args) {
        NPC bob = new NPC();
        NPC susan = new NPC();
        System.out.println("Bob's health: " + bob.getHealth());

        bob.setHealth(40);
        System.out.println("Bob's health again: " + bob.getHealth());
        System.out.println("Susan's health: " + susan.getHealth());
    }
}
