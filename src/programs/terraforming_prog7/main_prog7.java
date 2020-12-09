package programs.terraforming_prog7;

import java.util.*;

public class main_prog7 {
    public static void main(String[] arg) {
        boolean run = true;
        while (run) {
            Scanner in = new Scanner(System.in);
            System.out.println("\nWelcome to the Terra-forming Program\n");

            // getting name of planet
            System.out.print("Enter the name of your new planet: ");
            String planetName = in.next();

            // getting size of planet
            System.out.println("\nWhat size planet do you want?\n" +
                    "1) small\n" +
                    "2) medium\n" +
                    "3) large\n" +
                    "4) extra large");
            String planetSize = in.next().toLowerCase();

            // getting water percentage
            int percentLeft = 100;
            System.out.println("\nHow do you want to distribute the categories? Use percentages:");
            System.out.printf("Percentage remaining: %d\n", percentLeft);
            System.out.print("Enter water percentage: ");
            int percentWater = in.nextInt();
            percentLeft -= percentWater;

            // getting plant percentage
            System.out.printf("Percentage remaining: %d\n", percentLeft);
            System.out.print("Enter plant percentage: ");
            int percentPlant = in.nextInt();
            percentLeft -= percentPlant;

            // getting mineral percentage
            System.out.printf("Percentage remaining: %d\n", percentLeft);
            System.out.print("Enter mineral percentage: ");
            int percentMineral = in.nextInt();
            percentLeft -= percentMineral;

            // getting animal percentage
            System.out.printf("Percentage remaining: %d\n", percentLeft);
            System.out.print("Enter animal percentage: ");
            int percentAnimal = in.nextInt();
            percentLeft -= percentMineral;

            // checking if percentage is valid
            if (percentLeft < 0)
                System.out.println("ERROR, percentage remaining must equal 0, please try again");
            else {
                // confirming if the planet specs are okay
                System.out.printf("\nYou chose the following:\nPlanet size: %s\nterraobject distribution:\nwater: %d%%\nplant: %d%%\nmineral: %d%%\nanimal: %d%%\n", planetSize, percentWater, percentPlant, percentMineral, percentAnimal);
                System.out.print("Enter (yes) to continue with these choices or (no) to return to the menu: ");
                String confirm = in.next().toLowerCase();
                System.out.println();

                if (confirm.equals("yes")) {
                    boolean loop = true;
                    while (loop) {
                        Planet newPlanet = new Planet(planetName, planetSize, percentWater, percentPlant, percentMineral, percentAnimal);
                        System.out.printf("Planet name: %s, TerraObjects: %d, Impact Score: %d\n", newPlanet.getName(), newPlanet.getTotalTerraObjects(), newPlanet.getImpactScore());
                        System.out.println("1) List all water objects\n2) List all plant objects\n3) List all mineral objects\n4) List all animal objects\n5) Exit program");
                        switch (in.nextInt()) {
                            case 1 -> {
                                System.out.println("Listing all water objects");
                                newPlanet.listObjects(1);
                            }
                            case 2 -> {
                                System.out.println("Listing all plant objects");
                                newPlanet.listObjects(2);
                            }
                            case 3 -> {
                                System.out.println("Listing all mineral objects");
                                newPlanet.listObjects(3);
                            }
                            case 4 -> {
                                System.out.println("Listing all animal objects");
                                newPlanet.listObjects(4);
                            }
                            case 5 -> {
                                System.out.println("Exiting...");
                                run = false;
                                loop = false;
                            }
                            default -> System.out.println("Wrong input! Please re-enter.");
                        }
                    }
                }
            }
        }
    }
}
