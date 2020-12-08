package programs.terraforming_prog7;

import java.util.Random;

public class TopSoil extends MineralObject{
    public TopSoil() {
        setName("TopSoil");

        Random rand = new Random();
        setImpactScore(rand.nextInt(100 - 0 + 1) + 0);
    }
}
