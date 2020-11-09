package programs.collections_prog5;

import com.sun.source.tree.Tree;

import java.util.*;
import java.io.*;

public class main_prog5 {
    public static void main(String[]arg) throws FileNotFoundException {
        char [] onePointWords = {'a', 'e', 'i', 'o', 'u', 'l', 'n', 's', 't', 'r'};
        char [] twoPointWords = {'d', 'g'};
        char [] threePointWords = {'b', 'c', 'm', 'p'};
        char [] fourPointWords = {'f', 'h', 'v', 'w', 'y'};
        char [] fivePointWords = {'k'};
        char [] eightPointWords  = {'j', 'x'};
        char [] tenPointWords = {'q', 'z'};

        HashMap<Character, Integer> letterValues = new HashMap<Character, Integer>();
        TreeMap<Character, Integer> letterValues2 = new TreeMap<Character, Integer>();

        for (char letters : onePointWords){
            letterValues.put(letters, 1);
        }
        for (char letters : twoPointWords){
            letterValues.put(letters, 2);
        }
        for (char letters : threePointWords){
            letterValues.put(letters, 3);
        }
        for (char letters : fourPointWords){
            letterValues.put(letters, 4);
        }
        for (char letters : fivePointWords){
            letterValues.put(letters, 5);
        }
        for (char letters : eightPointWords){
            letterValues.put(letters, 8);
        }
        for (char letters : tenPointWords){
            letterValues.put(letters, 10);
        }

        HashMap<String, Integer> wordPoints = new HashMap<String, Integer>();
        TreeMap<String, Integer> wordPoints2 = new TreeMap<String, Integer>();

        File qWords = new File("QWords.txt");
        Scanner fileScanner = new Scanner(qWords);
        int total = 0;
        long startTime = System.currentTimeMillis();
        while (fileScanner.hasNextLine()){
            String word = fileScanner.nextLine();
            for (int i = 0; i < word.length(); i++){
                total += letterValues.get(word.charAt(i));
            }
            wordPoints.put(word, total);
            System.out.println(word + " - " + wordPoints.get(word));
            total = 0;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " milliseconds for hashmap");
    }
}
