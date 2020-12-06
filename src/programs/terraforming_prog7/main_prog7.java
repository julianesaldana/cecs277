package programs.terraforming_prog7;

import java.util.*;

public class main_prog7 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the TerraForming Program\n");

        System.out.print("Enter the name of your new planet: ");
        String name = in.next();

        System.out.println("\nWhat size planet do you want?\n" +
                "1) small\n" +
                "2) medium\n" +
                "3) large\n" +
                "4) extra large");
        String size = in.next();

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

        System.out.print("Enter (yes) to continue with these choices or (no) to return to the menu: ");
        String confirm = in.next().toLowerCase();

        if (confirm.equals("yes"))
            System.out.println("FINISH THIS");
        else
            System.out.println("FINISH THAT");
    }
}
