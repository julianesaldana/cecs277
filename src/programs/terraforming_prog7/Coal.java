package programs.terraforming_prog7;
import java.util.*;

public class Coal extends MineralObject {
    public Coal() {
        setName("Coal");

        Random rand = new Random();
        setImpactScore(rand.nextInt(100 - -100 + 1) + -100);
    }

}
