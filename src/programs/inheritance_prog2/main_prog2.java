// Julian Saldana
// Class (CECS 277-01)
// Project Name (Prog 2 – Inheritance)
// Due Date (Sept 22, 2020)
//I certify that this program is my own original work. I did not copy any part of this program from
//any other source. I further certify that I typed each and every line of code in this program.

package programs.inheritance_prog2;

import java.util.ArrayList;
import java.util.Scanner;

public class main_prog2 {
    public static void main(String[]arg){
        Scanner in = new Scanner(System.in);
        boolean run = true;
        shippingContainer sc1 = new shippingContainer();
        while (run){
            System.out.println("1) Create new Shipping Container with 10 preset luggage items of your choice\n" +
                    "2) Add luggage to Shipping Container\n" +
                    "3) Remove luggage from Shipping Container\n" +
                    "4) Show all luggage in the Shipping Container\n" +
                    "5) Quit");
            int option = in.nextInt();
            switch(option){
                case 1:
                    sc1 = new shippingContainer();
                    break;
                case 2:
                    System.out.println("Your options are:");
                    System.out.println("1-Box, 2-Cone, 3-Cube, 4-Cylinder, 5-Prism, 6-Pyramid, 7-Sphere, 8-Tetrahedron");
                    int option2 = in.nextInt();
                    switch(option2){
                        case 1:
                            System.out.println("Length width and height?");
                            sc1.add(new Box(in.nextInt(), in.nextInt(), in.nextInt()));
                            break;
                        case 2:
                            System.out.println("Radius and height?");
                            sc1.add(new Cone(in.nextInt(), in.nextInt()));
                            sc1.sort();
                            break;
                        case 3:
                            System.out.println("Side length?");
                            sc1.add(new Cube(in.nextInt()));
                            break;
                        case 4:
                            System.out.println("Radius and height?");
                            sc1.add(new Cylinder(in.nextInt(), in.nextInt()));
                            break;
                        case 5:
                            System.out.println("Base and height?");
                            sc1.add(new Prism(in.nextInt(), in.nextInt()));
                            break;
                        case 6:
                            System.out.println("Base and height?");
                            sc1.add(new Pyramid(in.nextInt(), in.nextInt()));
                            break;
                        case 7:
                            System.out.println("Radius?");
                            sc1.add(new Sphere(in.nextInt()));
                            break;
                        case 8:
                            System.out.println("Side length");
                            sc1.add(new Tetrahedron(in.nextInt()));
                            break;
                    }
                    break;
                case 3:
                    sc1.display();
                    System.out.print("Choose the number of the item you would like to remove: ");
                    int remove = in.nextInt();
                    sc1.remove(remove - 1);
                    System.out.printf("Option %d removed\n\n", remove);
                    break;
                case 4:
                    sc1.display();
                    System.out.println("Total amount in container: " + sc1.getSize());
                    System.out.println("Total volume: " + sc1.getTotalVolume());
                    System.out.println();
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
    }
}
