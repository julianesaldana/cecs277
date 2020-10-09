package programs.war_prog3;

public class warCard {
    private char rank;
    private char suit;

    public warCard(char r, char s) {
        rank = r;
        suit = s;
    }

    public void display() {
        if (rank == 'T')
            System.out.printf("%s%s ", "10", suit);
        else if (rank == 'A')
            System.out.printf("%s%s ", "11", suit);
        else
            System.out.printf("%s%s ", rank, suit);
    }

    public int getValue() {
        if (rank == 'T')
            return 10;
        else if (rank == 'J')
            return 11;
        else if (rank == 'Q')
            return 12;
        else if (rank == 'K')
            return 13;
        else if (rank == 'A')
            return 14;
        else
            return rank - 48; // using ascii code values to save from typing every number, works because int char = asii code value
    }
}
