package programs.terraforming_prog7;

public abstract class TerraObject {
    private String name;
    private int impactScore;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getImpactScore() {
        return impactScore;
    }

    public void setImpactScore(int newImpactScore) {
        impactScore = newImpactScore;
    }

    @Override
    public String toString() {
        return name + impactScore;
    }
}
