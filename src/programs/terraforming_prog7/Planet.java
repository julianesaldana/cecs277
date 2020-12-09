package programs.terraforming_prog7;

import java.util.*;

public class Planet {
    private final ArrayList<TerraObject> waterObjectContainer = new ArrayList<TerraObject>();
    private final ArrayList<TerraObject> plantObjectContainer = new ArrayList<TerraObject>();
    private final ArrayList<TerraObject> mineralObjectContainer = new ArrayList<TerraObject>();
    private final ArrayList<TerraObject> animalObjectContainer = new ArrayList<TerraObject>();
    private int totalTerraObjects;
    private int totalImpactScore;
    private final String name;

    public Planet(String n, int s, int waterPercentage, int plantPercentage, int mineralPercentage, int animalPercentage) {
        name = n;
        totalTerraObjects = 0;
        totalImpactScore = 0;

        Random rand = new Random();
        int maxSize;
        if (s == 1)
            maxSize = rand.nextInt(500 - 200 + 1) + 200;
        else if (s == 2)
            maxSize = rand.nextInt(1000 - 501 + 1) + 501;
        else if (s == 3)
            maxSize = rand.nextInt(1500 - 1001) + 1001;
        else
            maxSize = rand.nextInt() + 1501;

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
            waterObjectContainer.add(object);
        else if (object instanceof PlantObject)
            plantObjectContainer.add(object);
        else if (object instanceof MineralObject)
            mineralObjectContainer.add(object);
        else
            animalObjectContainer.add(object);

        totalTerraObjects++;
        totalImpactScore += object.getImpactScore();
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
        return name;
    }


    public int getTotalTerraObjects() {
        return totalTerraObjects;
    }

    public int getImpactScore() {
        return totalImpactScore;
    }
}
