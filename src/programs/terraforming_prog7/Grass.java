package programs.terraforming_prog7;

import java.util.Random;

public class Grass extends PlantObject {
    public Grass() {
        setName("Grass");

        Random rand = new Random();
        setImpactScore(rand.nextInt(100 - 0 + 1) + 0);
    }
}
