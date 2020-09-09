package programs.solitairePrime_prog1;

public class solitairePrimeCard {
    private char rank;
    private char suit;

    public solitairePrimeCard(char r, char s) {
        rank = r;
        suit = s;
    }

    public void display() {
        if (rank == 'T')
            System.out.printf("%s%s ", "10", suit);
        System.out.printf("%s%s ", rank, suit);
    }

    public int getValue() {
        if (rank == 'T' || rank == 'J' || rank == 'Q' || rank == 'K')
            return 10;
        else if (rank == 'A')
            return 1;
        else
            return rank - 48; // using ascii code values to save from typing every number, works because int char = asii code value
    }
}
