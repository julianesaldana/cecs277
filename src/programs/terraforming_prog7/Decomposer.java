package programs.terraforming_prog7;

import java.util.Random;

public class Decomposer extends AnimalObject {
    public Decomposer() {
        setName("Decomposer");

        Random rand = new Random();
        setImpactScore(rand.nextInt(0 - -100 + 1) + -100);
    }
}
