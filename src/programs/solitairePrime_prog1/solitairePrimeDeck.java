package programs.solitairePrime_prog1;

import java.util.Random;
import java.util.ArrayList;

public class solitairePrimeDeck {
    private ArrayList<solitairePrimeCard> storage;
    private int top;

    public solitairePrimeDeck() {
        top = 0;
        char [] suits = {'H', 'D', 'S', 'C'};
        char [] ranks = {'A', '2','3','4','5','6','7','8','9','T', 'J','Q', 'K'};
        storage = new ArrayList<solitairePrimeCard>();

        solitairePrimeCard C1;
        for (int s = 0; s < suits.length; s++){
            for (int r = 0; r < ranks.length; r++){
                C1 = new solitairePrimeCard(ranks[r], suits[s]);
                storage.add(C1);
            }
        }
    }

    public void display(){
        for (int i = 0; i < storage.size(); i++) {
            if (i % 13 == 0)
                System.out.println('\n');
            storage.get(i).display();
        }
        System.out.println();
    }

    public void shuffle() {
        Random rand = new Random();
        solitairePrimeCard temp;
        for (int i = 0; i < 52; i++){
            int new_card = rand.nextInt(52);
            temp = storage.get(i);
            storage.set(i, storage.get(new_card));
            storage.set(new_card, temp);
        }
    }

    public solitairePrimeCard deal() {
        return storage.get(top++);
    }

    public int cardsLeft(){
        return 52 - top;
    }
}
