package labs.files_lab7;

//Jacob Samson, Jared Deaton, Julian Saldana
//CECS 277 Sec 02
//Week 7 Lab
//Due Oct 6, 2020
// 4:45 PM PST

import java.io.*;
import java.util.Scanner;

public class files_lab7 {
    public static void main(String[] args) throws FileNotFoundException{
        //importing ziptable file
        File text = new File("ziptable.txt");

        // intializing scanners, files, printwriter
        Scanner scnr = new Scanner(text);
        File newFile = new File("new file.txt");
        PrintWriter prnt = new PrintWriter(newFile);

        // iterating through ziptable file and writing to new file
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            prnt.println(line);
            System.out.println(line);
        }
        prnt.close();
        scnr.close();

        //initializes two new files for states starting with vowels or consonants.
        File vowels = new File("vowel.txt");
        File consonants = new File("consonants.txt");
        scnr = new Scanner(text);

        //creates 2 new PrintWriter object to record states that starts with vowels or consonants
        PrintWriter prnt2 = new PrintWriter(vowels);
        PrintWriter prnt3 = new PrintWriter(consonants);

        //iterating through ziptable file and writing lines with vowels vs consonants to their appropriate files
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            char letter = line.charAt(0);
            //check if first character is a vowel and adds line to appropriate file
            if(letter == 'A' || letter =='E' || letter =='I' || letter =='O'|| letter =='U'){
                prnt2.println(line);
            }
            else{
                prnt3.println(line);
            }
        }
        //closing PrintWriters and Scanner
        prnt2.close();
        prnt3.close();
        scnr.close();
    }
}
