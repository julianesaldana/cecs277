package programs.terraforming_prog7;

import java.util.Random;

public class Seaweed extends TerraObject {
    public Seaweed() {
        setName("Seaweed");

        Random rand = new Random();
        setImpactScore(rand.nextInt(100 - 0 + 1) + 0);
    }
}
