package programs.terraforming_prog7;

import java.util.*;

public class main_prog7 {
    public static void main(String[] arg) {
        boolean run = true;
        while (run) {
            Scanner in = new Scanner(System.in);
            System.out.println("\nWelcome to the TerraForming Program\n");

            System.out.print("Enter the name of your new planet: ");
            String planetName = in.next();

            System.out.println("\nWhat size planet do you want? Enter the number of the option. \n" +
                    "1) small\n" +
                    "2) medium\n" +
                    "3) large\n" +
                    "4) extra large");
            int size = in.nextInt();

            int percentLeft = 100;
            System.out.println("\nHow do you want to distribute the categories? Use percentages:");
            System.out.printf("Percentage remaining: %d\n", percentLeft);
            System.out.print("Enter water percentage: ");
            int percentWater = in.nextInt();
            percentLeft -= percentWater;
            System.out.printf("Percentage remaining: %d\n", percentLeft);
            System.out.print("Enter plant percentage: ");
            int percentPlant = in.nextInt();
            percentLeft -= percentPlant;
            System.out.printf("Percentage remaining: %d\n", percentLeft);
            System.out.print("Enter mineral percentage: ");
            int percentMineral = in.nextInt();
            percentLeft -= percentMineral;
            System.out.printf("Percentage remaining: %d\n", percentLeft);
            System.out.print("Enter animal percentage: ");
            int percentAnimal = in.nextInt();
            percentLeft -= percentMineral;

            if (percentLeft < 0)
                System.out.println("ERROR, percentage remaining must equal 0, please try again");
            else {
                System.out.print("Enter (yes) to continue with these choices or (no) to return to the menu: ");
                String confirm = in.next().toLowerCase();
                System.out.println();

                if (confirm.equals("yes")) {
                    boolean loop = true;
                    while (loop) {
                        int temp = 0, temp2 = 0;
                        System.out.printf("Planet name: %s, TerraObjects: %d, Impact Score: %d\n", planetName, temp, temp2);
                        System.out.println("1) List all water objects\n2) List all plant objects\n3) List all mineral objects\n4) List all animal objects\n5) Exit program");
                        switch (in.nextInt()) {
                            case 1:
                                System.out.println("Listing all water objects");
                                break;
                            case 2:
                                System.out.println("Listing all plant objects");
                                break;
                            case 3:
                                System.out.println("Listing all mineral objects");
                                break;
                            case 4:
                                System.out.println("Listing all animal objects");
                                break;
                            case 5:
                                System.out.println("Exiting...");
                                run = false;
                                loop = false;
                                break;
                            default:
                                System.out.println("Wrong input! Please re-enter.");
                                break;
                        }
                    }
                }
            }
        }
    }
}
