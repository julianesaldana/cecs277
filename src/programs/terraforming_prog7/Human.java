package programs.terraforming_prog7;

import java.util.Random;

public class Human extends AnimalObject {
    public Human() {
        setName("Human");

        Random rand = new Random();
        setImpactScore(rand.nextInt(0 - -100 + 1) + -100);
    }
}
