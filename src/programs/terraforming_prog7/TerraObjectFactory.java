package programs.terraforming_prog7;

import java.util.*;

public class TerraObjectFactory {
    public TerraObject createWaterObject() {
        Random rand = new Random();
        int randomNum = rand.nextInt(4);

        if (randomNum == 0)
            return new River();
        else if (randomNum == 1)
            return new Lake();
        else if (randomNum == 2)
            return new Ocean();
        else
            return new Pond();
    }

    public TerraObject createPlantObject() {
        Random rand = new Random();
        int randomNum = rand.nextInt(4);

        if (randomNum == 0)
            return new Grass();
        else if (randomNum == 1)
            return new Tree();
        else if (randomNum == 2)
            return new Seaweed();
        else
            return new Bush();
    }

    public TerraObject createMineralObject() {
        Random rand = new Random();
        int randomNum = rand.nextInt(4);

        if (randomNum == 0)
            return new TopSoil();
        else if (randomNum == 1)
            return new Coal();
        else if (randomNum == 2)
            return new Quartz();
        else
            return new Iron();
    }

    public TerraObject createAnimalObject() {
        Random rand = new Random();
        int randomNum = rand.nextInt(4);

        if (randomNum == 0)
            return new Human();
        else if (randomNum == 1)
            return new Predator();
        else if (randomNum == 2)
            return new Prey();
        else
            return new Decomposer();
    }
}
