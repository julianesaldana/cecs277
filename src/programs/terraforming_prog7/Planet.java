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
    private int maxSize;

    public Planet(String n, int s, int waterPercentage, int plantPercentage, int mineralPercentage, int animalPercentage) {
        this.name = n;
        this.totalTerraObjects = 0;
        this.totalImpactScore = 0;

        Random rand = new Random();
        if (s == 1)
            this.maxSize = rand.nextInt(500 - 200 + 1) + 200;
        else if (s == 2)
            this.maxSize = rand.nextInt(1000 - 501 + 1) + 501;
        else if (s == 3)
            this.maxSize = rand.nextInt(1500 - 1001) + 1001;
        else
            this.maxSize = rand.nextInt() + 1501;

        TerraObjectFactory factory = new TerraObjectFactory();
        for (int i = 0; i < (waterPercentage / 100) * maxSize; i++){
            addObject(factory.getWaterObject());
        }
        for (int i = 0; i < (mineralPercentage / 100) * maxSize; i++){
            addObject(factory.getMineralObject());
        }
        for (int i = 0; i < (animalPercentage/100) * maxSize; i++){
            addObject(factory.getAnimalObject());
        }
        for (int i = 0; i < (plantPercentage/100) * maxSize; i++){
            addObject(factory.getPlantObject());
        }
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
        this.totalImpactScore += object.getImpactScore();
    }

    public void listObjects(int option) {
        if (option == 1) {
            for (TerraObject obj : waterObjectContainer)
                System.out.print(obj + " ");
        }
        else if (option == 2) {
            for (TerraObject obj : plantObjectContainer)
                System.out.print(obj + " ");
        }
        else if (option == 3) {
            for (TerraObject obj : mineralObjectContainer)
                System.out.print(obj + " ");
        }
        else if (option == 4) {
            for (TerraObject obj : animalObjectContainer)
                System.out.print(obj + " ");
        }
    }

    public String getName() {
        return this.name;
    }


    public int getTotalTerraObjects() {
        return this.totalTerraObjects;
    }

    public int getImpactScore() {
        return this.totalImpactScore;
    }
}
