package programs.terraforming_prog7;

import java.util.Random;

public class Bush extends PlantObject {
    public Bush() {
        setName("Bush");

        Random rand = new Random();
        setImpactScore(rand.nextInt(100 - 0 + 1) + 0);
    }
}
