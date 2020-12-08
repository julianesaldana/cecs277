package programs.terraforming_prog7;

import java.util.Random;

public class Quartz extends MineralObject {
    public Quartz() {
        setName("Quartz");

        Random rand = new Random();
        setImpactScore(rand.nextInt(100 - -100 + 1) + -100);
    }
}
