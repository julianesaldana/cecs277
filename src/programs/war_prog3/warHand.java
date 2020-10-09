package programs.war_prog3;

import java.util.ArrayList;

public class warHand extends warDeck{
    private ArrayList<warCard> storage;

    public warHand(warDeck d){
        this.storage = new ArrayList<warCard>();
        for (int i = 0; i < 26; i++){
            this.storage.add(d.warDeal());
        }
    }

    public void add(warCard C){
        this.storage.add(C);
    }

    public void pop(){
        this.storage.remove(0);
    }

    @Override
    public void display(){
        for (int i = 0; i < this.storage.size(); i++) {
            if (i % 13 == 0)
                System.out.println('\n');
            this.storage.get(i).display();
        }
        System.out.println("\n\n");
    }

    @Override
    public warCard warDeal() {
        return this.storage.get(0);
    }

    @Override
    public int cardsLeft(){
        return this.storage.size();
    }
}
