package programs.terraforming_prog7;

import java.util.Random;

public class Lake extends WaterObject{
    public Lake() {
        setName("Lake");

        Random rand = new Random();
        setImpactScore(rand.nextInt(50 - 40 + 1) + 40);
    }
}
