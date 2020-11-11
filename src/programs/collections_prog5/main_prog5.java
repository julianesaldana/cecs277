//	Julian Saldana
//	CECS 277-01
//	Prog 5 - Collections
//	10/10/2020
//	I certify that this program is my own original work. I did not copy any part of this program from
//	any other source. I further certify that I typed each and every line of code in this program.

package programs.collections_prog5;

import java.util.*;
import java.io.*;

public class main_prog5 {
    public static void main(String[]arg) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        char [] onePointLetters = {'a', 'e', 'i', 'o', 'u', 'l', 'n', 's', 't', 'r'};
        char [] twoPointLetters = {'d', 'g'};
        char [] threePointLetters = {'b', 'c', 'm', 'p'};
        char [] fourPointLetters = {'f', 'h', 'v', 'w', 'y'};
        char [] fivePointLetters = {'k'};
        char [] eightPointLetters  = {'j', 'x'};
        char [] tenPointLetters = {'q', 'z'};

        HashMap<Character, Integer> letterValues = new HashMap<Character, Integer>();

        for (char letters : onePointLetters){
            letterValues.put(letters, 1);
        }
        for (char letters : twoPointLetters){
            letterValues.put(letters, 2);
        }
        for (char letters : threePointLetters){
            letterValues.put(letters, 3);
        }
        for (char letters : fourPointLetters){
            letterValues.put(letters, 4);
        }
        for (char letters : fivePointLetters){
            letterValues.put(letters, 5);
        }
        for (char letters : eightPointLetters){
            letterValues.put(letters, 8);
        }
        for (char letters : tenPointLetters){
            letterValues.put(letters, 10);
        }

        // part 1, q words, scrabble points using maps
        // hashmap section
        System.out.println("Using hashmap with q words");

        File qWords = new File("QWords.txt");
        Scanner fileScanner = new Scanner(qWords);

        HashMap<String, Integer> wordPointsHashMapQ = new HashMap<String, Integer>();
        long startTime = System.nanoTime();
        while (fileScanner.hasNextLine()){
            int total = 0;
            String word = fileScanner.nextLine();
            for (int i = 0; i < word.length(); i++){
                total += letterValues.get(word.charAt(i));
            }
            wordPointsHashMapQ.put(word, total);
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime + " nanoseconds for loading into hashmap");

        Iterator<Map.Entry<String, Integer>> hashMapQIter = wordPointsHashMapQ.entrySet().iterator();
        startTime = System.nanoTime();
        while(hashMapQIter.hasNext()){
            Map.Entry<String, Integer> word = hashMapQIter.next();
            System.out.println(word.getKey() + " - " + word.getValue());
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime + " nanoseconds for printing hashmap\n");


        // treemap section
        System.out.print("Press enter to continue...");
        in.nextLine();
        System.out.println("\nUsing treemap with q words");

        qWords = new File("QWords.txt");
        fileScanner = new Scanner(qWords);

        TreeMap<String, Integer> wordPointsTreeMapQ = new TreeMap<String, Integer>();
        startTime = System.nanoTime();
        while (fileScanner.hasNextLine()){
            int total = 0;
            String word = fileScanner.nextLine();
            for (int i = 0; i < word.length(); i++){
                total += letterValues.get(word.charAt(i));
            }
            wordPointsTreeMapQ.put(word, total);
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime + " nanoseconds for loading into treemap");

        Iterator<Map.Entry<String, Integer>> treeMapQIter = wordPointsTreeMapQ.entrySet().iterator();
        startTime = System.nanoTime();
        while(treeMapQIter.hasNext()){
            Map.Entry<String, Integer> word = treeMapQIter.next();
            System.out.println(word.getKey() + " - " + word.getValue());
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime + " nanoseconds for printing treemap\n");

        // part 2, alice in wonderland, storing words with sets
        // hashset section
        System.out.print("Press enter to continue...");
        in.nextLine();
        System.out.println("\nUsing hashset with alice in wonderland");

        File alice = new File("alice.txt");
        fileScanner = new Scanner(alice);

        HashSet<String> hashSetAlice = new HashSet<String>();
        startTime = System.nanoTime();
        while (fileScanner.hasNext()){
            hashSetAlice.add(fileScanner.next().replaceAll("[^a-zA-Z]","").toLowerCase());
        }
        endTime = System.nanoTime();
        System.out.print(endTime - startTime + " nanoseconds for loading into hashset");

        String [] randomWords = new String[100];
        Random rand = new Random();
        int lineCount = 0;
        int wordCount = 0;
        int randomNumber = rand.nextInt(hashSetAlice.size());

        Iterator<String> hashSetAliceIter = hashSetAlice.iterator();

        startTime = System.nanoTime();
        while (hashSetAliceIter.hasNext() && wordCount < randomWords.length){
            String word = hashSetAliceIter.next();
            if (lineCount == randomNumber){
                randomWords[wordCount] = word;
                wordCount++;
                hashSetAliceIter = hashSetAlice.iterator();
                randomNumber = rand.nextInt(hashSetAlice.size());
            }
            else if (lineCount < randomNumber)
                lineCount++;
            else
                lineCount--;
        }
        endTime = System.nanoTime();
        System.out.println();
        System.out.println(endTime - startTime + " nanoseconds for searching into hashset\n");


        // treeset section
        System.out.print("Press enter to continue...");
        in.nextLine();
        System.out.println("\nUsing treeset with alice in wonderland");

        alice = new File("alice.txt");
        fileScanner = new Scanner(alice);

        TreeSet<String> treeSetAlice = new TreeSet<String>();
        startTime = System.nanoTime();
        while (fileScanner.hasNext()){
            treeSetAlice.add(fileScanner.next().replaceAll("[^a-zA-Z]","").toLowerCase());
        }
        endTime = System.nanoTime();
        System.out.print(endTime - startTime + " nanoseconds for loading into treeset");

        randomWords = new String[100];
        lineCount = 0;
        wordCount = 0;
        randomNumber = rand.nextInt(treeSetAlice.size());

        Iterator<String> treeSetAliceIter = treeSetAlice.iterator();

        startTime = System.nanoTime();
        while (treeSetAliceIter.hasNext() && wordCount < randomWords.length){
            String word = treeSetAliceIter.next();
            if (lineCount == randomNumber){
                randomWords[wordCount] = word;
                wordCount++;
                treeSetAliceIter = treeSetAlice.iterator();
                randomNumber = rand.nextInt(treeSetAlice.size());
            }
            else if (lineCount < randomNumber)
                lineCount++;
            else
                lineCount--;
        }
        endTime = System.nanoTime();
        System.out.println();
        System.out.println(endTime - startTime + " nanoseconds for searching into treeset\n");


        // part 3, alice in wonderland, using sets and maps to store words with their scrabble points
        // hashMap section
        System.out.print("Press enter to continue...");
        in.nextLine();
        System.out.println("\nUsing hashmap for scrabble with alice");

        HashMap<String, Integer> wordPointsHashMapAlice = new HashMap<String, Integer>();
        startTime = System.nanoTime();
        for (String word : hashSetAlice){
            int total = 0;
            for (int i = 0; i < word.length(); i++){
                total += letterValues.get(word.charAt(i));
            }
            wordPointsHashMapAlice.put(word, total);
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime + " nanoseconds for adding words and values into hashmap");

        Iterator<Map.Entry<String, Integer>> hashMapAliceIter = wordPointsHashMapAlice.entrySet().iterator();
        int totalWords = 0;
        int totalPoints = 0;
        startTime = System.nanoTime();
        while(hashMapAliceIter.hasNext()){
            totalWords++;
            Map.Entry<String, Integer> word = hashMapAliceIter.next();
            totalPoints += word.getValue();
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime + " nanoseconds for traversing and totaling words and points for hashmap");
        System.out.printf("Total words = %d, total points = %d\n\n", totalWords, totalPoints);


        // treeMap section
        System.out.print("Press enter to continue...");
        in.nextLine();
        System.out.println("\nUsing treemap for scrabble with alice");

        TreeMap<String, Integer> wordPointsTreeMapAlice = new TreeMap<String, Integer>();
        startTime = System.nanoTime();
        for (String word : hashSetAlice){
            int total = 0;
            for (int i = 0; i < word.length(); i++){
                total += letterValues.get(word.charAt(i));
            }
            wordPointsTreeMapAlice.put(word, total);
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime + " nanoseconds for adding words and values into treemap");

        Iterator<Map.Entry<String, Integer>> treeMapAliceIter = wordPointsTreeMapAlice.entrySet().iterator();
        totalWords = 0;
        totalPoints = 0;
        startTime = System.nanoTime();
        while(treeMapAliceIter.hasNext()){
            totalWords += 1;
            Map.Entry<String, Integer> word = treeMapAliceIter.next();
            totalPoints += word.getValue();
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime + " nanoseconds for traversing and totaling words and points for treemap");
        System.out.printf("Total words = %d, total points = %d\n", totalWords, totalPoints);
    }
}
