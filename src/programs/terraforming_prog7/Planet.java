package programs.terraforming_prog7;

import java.util.*;

public class Planet {
    private final ArrayList<TerraObject> waterObjectContainer = new ArrayList<TerraObject>();
    private final ArrayList<TerraObject> plantObjectContainer = new ArrayList<TerraObject>();
    private final ArrayList<TerraObject> mineralObjectContainer = new ArrayList<TerraObject>();
    private final ArrayList<TerraObject> animalObjectContainer = new ArrayList<TerraObject>();
    private int totalTerraObjects;
    private int totalImpactScore;
    private String name;
    private int size;

    public Planet(String n, int s) {
        this.name = n;

        Random rand = new Random();
        if (s == 1)
            this.size = rand.nextInt(500 - 200 + 1) + 200;
        else if (s == 2)
            this.size = rand.nextInt(1000 - 501 + 1) + 501;
        else if (s == 3)
            this.size = rand.nextInt(1500 - 1001) + 1001;
        else
            this.size = rand.nextInt() + 1501;
    }

    public void addObject(TerraObject object) {
        if (object instanceof WaterObject)
            this.waterObjectContainer.add(object);
        else if (object instanceof PlantObject)
            this.plantObjectContainer.add(object);
        else if (object instanceof MineralObject)
            this.mineralObjectContainer.add(object);
        else
            this.animalObjectContainer.add(object);
        this.totalTerraObjects++;
    }

    public void getALlWaterObjects() {

    }
}
