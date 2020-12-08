package programs.terraforming_prog7;
import java.util.*;

public class Coal extends MineralObject{
    private final String name = "Coal";
    private int impactScore;

    public Coal(){ // range is -200 to -150
        Random rand = new Random();
        this.impactScore = rand.nextInt(-150 - -200 + 1) + -200; //nextInt(max - min + 1) + min;
    }
    public int getImpactScore() { return this.impactScore; }

    @Override
    public String toString() {
        return name + "," + impactScore;
    }
}
