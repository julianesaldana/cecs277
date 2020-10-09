// Julian Saldana
// Class (CECS 277-01)
// Project Name (Prog 1 – Solitaire Prime)
// Due Date (Sept 8, 2020)
//I certify that this program is my own original work. I did not copy any part of this program from
//any other source. I further certify that I typed each and every line of code in this program.

package programs.solitairePrime_prog1;

import java.util.Scanner;

public class solitairePrimeMain {
    public static void main(String[]arg){
        System.out.println("Welcome to Solitaire Prime!");
        solitairePrimeDeck deck = new solitairePrimeDeck();
        boolean loop = true;
        while (loop){
            switch (menu()){
                case 1:
                    deck = new solitairePrimeDeck();
                    break;
                case 2:
                    deck.display();
                    break;
                case 3:
                    deck.shuffle();
                    break;
                case 4:
                    System.out.println("Playing Solitaire Prime!");
                    int pile = 0;
                    int pileCtr = 0;
                    for (int i = 0; i < 52; i++) {      // starts dealing and playing
                        solitairePrimeCard tempCard = deck.deal();
                        tempCard.display();
                        pile += tempCard.getValue();
                        System.out.print(", ");
                        if (isPrime(pile)){
                            System.out.printf("Prime: %d\n", pile);
                            pile = 0;
                            pileCtr++;
                        }
                    }
                    if ((deck.cardsLeft() == 0) && (pile == 0)) {
                        System.out.printf("Winner in %d piles!\n", pileCtr);
                    } else
                        System.out.println("Loser");
                    break;
                case 5:
                    System.out.println("Thank you for playing!");
                    loop = false;
                    break;
                default:
                    System.out.println("Error - you must enter a number 1 - 5!");
            }
        }
    }

    public static int menu(){
        System.out.println("\n1) New Deck\n2) Display Deck\n3) Shuffle deck\n" +
                "4) Play Solitaire Prime\n5) Exit\n");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static boolean isPrime(int x){
        if (x == 1)
            return false;
        for (int i = 2; i <= x / 2; i++) {      // actual prime checker
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
