// Julian Saldana
// Class (CECS 277-01)
// Project Name (Prog 4 – File I/0)
// Due Date (October 27, 2020)
//I certify that this program is my own original work. I did not copy any part of this program from
//any other source. I further certify that I typed each and every line of code in this program.

package programs.fileIO_prog4;

import java.io.*;
import java.util.*;

public class main_prog4 {
    public static void main(String[]arg) throws FileNotFoundException {
        // getting user filename
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String userInput = in.nextLine();

        // creating instance of file with user input
        File userFile = new File(userInput);

        // creating instance of scanner which will be able to read things from file
        Scanner fileScanner = new Scanner (userFile);

        // skipping first line because it is only header information
        fileScanner.nextLine();

        // instantiating values needed to gather and store rates, total rates, rate info
        double maxRate = 0;
        double minRate = 1;
        double total = 0;
        double counter = 0;
        String [] maxInfo = new String[9];
        String [] minInfo = new String[9];

        // going through the whole file until it runs out of lines
        while (fileScanner.hasNextLine()){
            // keeping track of total amount of rates
            counter += 1;
            // creating an array of all the info for each line, splitting at commas because csv format
            String [] tempArray = fileScanner.nextLine().split(",");
            // parsing at index 6 because that is the comm_rate location, adding to total value of rates
            double tempRate = Double.parseDouble(tempArray[6]);
            total += tempRate;
            // checking max and updating if needed, storing the value of the line if req met to use for later
            if (tempRate > maxRate){
                maxInfo = tempArray;
                maxRate = tempRate;
            }
            // same as above but with the min value
            else if (tempRate < minRate){
                minInfo = tempArray;
                minRate = tempRate;
            }
        }
        fileScanner.close();

        System.out.println("The average commercial rate is: $" + total / counter);
        System.out.printf("The highest rate is: %s (%s, %s) - $%s\n", maxInfo[2], maxInfo[1], maxInfo[3], maxInfo[6]);
        System.out.printf("The lowest rate is: %s (%s, %s) - $%s\n", minInfo[2], minInfo[1], minInfo[3], minInfo[6]);
    }
}
