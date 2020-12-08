package programs.terraforming_prog7;

import java.util.Random;

public class Predator extends AnimalObject {
    public Predator() {
        setName("Predator");

        Random rand = new Random();
        setImpactScore(rand.nextInt(0 - -100 + 1) + -100);
    }
}
