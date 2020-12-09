package programs.terraforming_prog7;

import java.util.*;

public class River extends WaterObject {
    public River() {
        setName("River");

        Random rand = new Random();
        setImpactScore(rand.nextInt(60 - 10 + 1) + 10);
    }
}
