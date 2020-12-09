package programs.terraforming_prog7;

import java.util.*;

public class Planet {
    private final ArrayList<TerraObject> terraObjectContainer = new ArrayList<>();
    private int totalTerraObjects;
    private int totalImpactScore;
    private final String name;

    public Planet(String n, String size, int waterPercentage, int plantPercentage, int mineralPercentage, int animalPercentage) {
        name = n;
        totalTerraObjects = 0;
        totalImpactScore = 0;

        Random rand = new Random();
        int maxSize;
        if (size.equals("small"))
            maxSize = rand.nextInt(500 - 200 + 1) + 200;
        else if (size.equals("medium"))
            maxSize = rand.nextInt(1000 - 501 + 1) + 501;
        else if (size.equals("large"))
            maxSize = rand.nextInt(1500 - 1001) + 1001;
        else
            maxSize = rand.nextInt() + 1501;


        TerraObjectFactory factory = new TerraObjectFactory();
        for (int i = 0; i < (int) ((waterPercentage / 100.0) * maxSize); i++) {
            addObject(factory.createWaterObject());
        }
        for (int i = 0; i < (int) ((plantPercentage / 100.0) * maxSize); i++) {
            addObject(factory.createPlantObject());
        }
        for (int i = 0; i < (int) ((mineralPercentage / 100.0) * maxSize); i++) {
            addObject(factory.createMineralObject());
        }
        for (int i = 0; i < (int) ((animalPercentage / 100.0) * maxSize); i++) {
            addObject(factory.createAnimalObject());
        }
    }

    public void addObject(TerraObject object) {
        terraObjectContainer.add(object);
        totalTerraObjects++;
        totalImpactScore += object.getImpactScore();
    }

    public void listObjects(int option) {
        switch (option) {
            case 1:
                for (TerraObject obj : terraObjectContainer) {
                    if (obj instanceof WaterObject)
                        System.out.print(obj);
                }
                break;
            case 2:
                for (TerraObject obj : terraObjectContainer) {
                    if (obj instanceof PlantObject)
                        System.out.print(obj);
                }
                break;
            case 3:
                for (TerraObject obj : terraObjectContainer) {
                    if (obj instanceof MineralObject)
                        System.out.print(obj);
                }
                break;
            case 4:
                for (TerraObject obj : terraObjectContainer) {
                    if (obj instanceof AnimalObject)
                        System.out.print(obj);
                }
                break;
        }
        System.out.println();
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
