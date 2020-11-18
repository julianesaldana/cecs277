package labs.lab13;

public class whippedCream extends IceCreamDecorator{
    // the dessert we are decorating
    // notice the use of composition rather than inheritance
    protected Dessert flavor;

    public static final double COST = 0.25;

    public whippedCream(Dessert flavor) {
        this.flavor = flavor;
    }

    public String getDescription() {
        return flavor.getDescription() + " with whipped cream";
    }

    public double cost() {
        return flavor.cost() + COST;
    }
}
