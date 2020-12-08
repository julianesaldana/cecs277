package programs.terraforming_prog7;

import java.util.Random;

public class Prey extends AnimalObject {
    public Prey() {
        setName("Prey");

        Random rand = new Random();
        setImpactScore(rand.nextInt(0 - -100 + 1) + -100);
    }
}
