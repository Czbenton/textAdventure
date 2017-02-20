/**
 * Created by Zach on 8/31/16.
 */

import java.util.ArrayList;

public class Player extends Character {
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();


    public Player() {
        this.health = 100;
        this.damage = 20;
    }

    public void chooseName() {
        System.out.println("Welcome Hero");
        System.out.println("What is your name?");
        name = Game.nextLine();
        System.out.println("We are well met on the path, " + name + "\n");
    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon: Gun or Magic?");

        boolean continueLoop = true;
        while (continueLoop) {
            weapon = Game.nextLine();
            if (weapon.equalsIgnoreCase("gun")) {
                System.out.println("The only choice of a Gunslinger. Stay true to the path.\n");
                continueLoop = false;
            } else if (weapon.equalsIgnoreCase("magic")) {
                System.out.println("Magic is an old and powerful weapon of Eld. Wield it well, Wizard.\n");
                continueLoop = false;
            } else {
                System.out.println("Do not play games with me traveler, choose a weapon!\n");
            }
        }
    }

    public void chooseLocation() throws Exception {
        System.out.println("Choose your road. North to the Wastelands or South to the Forests.");

        boolean continueLoop = true;
        while (continueLoop) {
            location = Game.nextLine();
            if (location.equalsIgnoreCase("north")) {
                System.out.println("The Wastelands are a noble choice. Many Gunslingers have followed the path of the beam there.");
                continueLoop = false;
            } else if (location.equalsIgnoreCase("south")) {
                System.out.println("The Forests are dangerous at the best of times. Choose your path carefully and be prepared for anything.");
                continueLoop = false;
            } else {
                System.out.println("Your path does not lye in that direction");
            }
        }
    }

    public void findItem(String item) {
        System.out.println("You found a " + item + "! Pick it up? [y/n]");
        String answer = Game.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.println("You picked up an item!");
        } else {
            System.out.println("You discard the " + item);
        }
    }
}


