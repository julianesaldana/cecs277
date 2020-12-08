package programs.terraforming_prog7;

import java.util.Random;

public class Tree extends TerraObject {
    public Tree() {
        setName("Tree");

        Random rand = new Random();
        setImpactScore(rand.nextInt(100 - 0 + 1) + 0);
    }
}
