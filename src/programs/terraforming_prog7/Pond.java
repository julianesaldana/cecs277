package programs.terraforming_prog7;

import java.util.Random;

public class Pond extends WaterObject{
    public Pond() {
        setName("Pond");

        Random rand = new Random();
        setImpactScore(rand.nextInt(10 - 5 + 1) + 5);
    }
}
