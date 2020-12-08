package programs.terraforming_prog7;

import java.util.Random;

public class Ocean extends WaterObject{
    public Ocean() {
        setName("Ocean");

        Random rand = new Random();
        setImpactScore(rand.nextInt(100 - 50 + 1) + 50);
    }
}
