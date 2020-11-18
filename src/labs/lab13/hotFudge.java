package labs.lab13;

public class hotFudge {
    // the dessert we are decorating
    // notice the use of composition rather than inheritance
    protected Dessert flavor;

    public static final double COST = 0.25;

    public hotFudge(Dessert flavor) {
        this.flavor = flavor;
    }

    public String getDescription() {
        return flavor.getDescription() + " with hot fudge";
    }

    public double cost() {
        return flavor.cost() + COST;
    }
}
