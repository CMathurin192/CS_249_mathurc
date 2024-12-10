package edu.mathurc.assign05;

import java.util.*;

public class Woods {
    private List<Giant> Giants_List = new ArrayList<>();

    public Giant createGiant(String name, String typeName) {
        if(name.isEmpty()) {
            return null;
        }
        else {
            if(typeName.equals("GIANT")) {
                return new Giant(name);
            }
            else if(typeName.equals("TROLL")) {
                return new Troll(name);
            }
            else if(typeName.equals("TREE")) {
                return new Tree(name);
            }
            else if(typeName.equals("ENT")) {
                return new Ent(name);
            }
            else if(typeName.equals("HUORN")) {
                return new Huorn(name);
            }
            else {
                return null;
            }
        }
    }

    public boolean addGiant(String name, String typeName) {
        if(createGiant(name, typeName) != null) {
            Giants_List.add(createGiant(name, typeName));
            return true;
        }
        else {
            return false;
        }

    }

    public Giant getGiant(int index) {
        if(index >= 0 && index < Giants_List.size()) {
            return Giants_List.get(index);
        }
        return null;
    }

    public void printAllGiants() {
        System.out.println("ALL GIANTS:");
        for (Giant giant : Giants_List) {
            System.out.println("- " + giant.toString());
        }
    }

    public void printAllTrees() {
        System.out.println("ALL TREES:");
        for (Giant giant : Giants_List) {
            if (giant instanceof Tree) {
                System.out.println("- " + giant.toString() + ": " + ((Tree)giant).speak());
            }
        }
    }

    public void printAllTrolls() {
        System.out.println("ALL TROLLS:");
        for (Giant giant : Giants_List) {
            if (giant instanceof Troll) {
                System.out.println("- " + giant.toString() + ": " + ((Troll)giant).cook());
            }
        }
    }
}
