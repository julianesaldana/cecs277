package programs.war_prog3;

import java.util.Random;
import java.util.ArrayList;

public class warDeck {
    private final ArrayList<warCard> storage;
    private int top;

    enum Suit{
        CLUBS('C'), SPADES('S'), HEARTS('H'), DIAMONDS('D');
        private final char suit;

        private Suit(char s){
            this.suit = s;
        }

        public char getSuit(){
            return this.suit;
        }
    }

    enum Rank{
        ACE('A'), TWO('2'), THREE('3'), FOUR('4'), FIVE('5'), SIX('6'), SEVEN('7'), EIGHT('8'), NINE('9'), TEN('T'), JACK('J'), QUEEN('Q'), KING('K');
        private final char rank;

        private Rank(char r){
            this.rank = r;
        }

        public char getRank(){
            return this.rank;
        }
    }
    
    public warDeck() {
        top = 0;
        storage = new ArrayList<warCard>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                storage.add(new warCard(rank.getRank(), suit.getSuit()));
            }
        }
    }

    public void display(){
        for (int i = 0; i < this.storage.size(); i++) {
            if (i % 13 == 0)
                System.out.println('\n');
            this.storage.get(i).display();
        }
        System.out.println("\n");
    }

    public void shuffle() {
        Random rand = new Random();
        warCard temp;
        for (int i = 0; i < storage.size(); i++){
            int new_card = rand.nextInt(storage.size());
            temp = storage.get(i);
            storage.set(i, storage.get(new_card));
            storage.set(new_card, temp);
        }
    }

    public warCard warDeal() {
        return storage.get(top++);
    }

    public warCard getCard(int x){
        return storage.get(x);
    }

    public int cardsLeft(){
        return storage.size();
    }
}
