package programs.terraforming_prog7;

import java.util.Random;

public class Iron extends MineralObject {
    public Iron() {
        setName("Iron");

        Random rand = new Random();
        setImpactScore(rand.nextInt(100 - -100 + 1) + -100);
    }
}
