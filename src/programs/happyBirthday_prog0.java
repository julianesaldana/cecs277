// Julian Saldana
// Class (CECS 277-01)
// Project Name (Prog 0 – Happy Birthday)
// Due Date (Sept 1, 2020)

package programs;

import java.util.Scanner;

public class happyBirthday_prog0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.next();
        System.out.printf("How old are you %s? ", name);
        int age = in.nextInt();
        System.out.printf("%s, have you had your birthday yet this year? (y/n) ", name);
        String response = in.next();

        int birthYear;
        if (response.charAt(0) == 'y' || response.charAt(0) == 'Y')
            birthYear = 2020 - age;
        else
            birthYear = 2019 - age;

        System.out.printf("You were born in %d", birthYear);
    }
}