package labs.lab13;// Test code for the decorator pattern.

public class Holstein {
    public static void main(String[] args) {
        Dessert chocolate = new Chocolate();

        System.out.println(chocolate.getDescription());
        System.out.println(chocolate.cost());

        // now decorate the chocolate with a cherry
        chocolate = new Cherry(chocolate);
        System.out.println(chocolate.getDescription());
        System.out.println(chocolate.cost());

        // now add a second cherry
        chocolate = new Cherry(chocolate);
        System.out.println(chocolate.getDescription());
        System.out.println(chocolate.cost());

        // we can also decorate an ice cream cone with
        // two cherries in a single step
        Dessert strawberry = new Strawberry();
        strawberry = new Cherry(new Cherry(strawberry));
        System.out.println(strawberry.getDescription());
        System.out.println(strawberry.cost());

        Dessert vanilla = new Vanilla();

        System.out.println(vanilla.getDescription());
        System.out.println(vanilla.cost());

        vanilla = new Cherry(vanilla);
        System.out.println(vanilla.getDescription());
        System.out.println(vanilla.cost());

        vanilla = new hotFudge(vanilla);
        System.out.println(vanilla.getDescription());
        System.out.println(vanilla.cost());

        Dessert chocolateTwo = new Chocolate();

        System.out.println(chocolateTwo.getDescription());
        System.out.println(chocolateTwo.cost());

        chocolateTwo = new hotFudge(chocolateTwo);
        System.out.println(chocolateTwo.getDescription());
        System.out.println(chocolateTwo.cost());

        chocolateTwo = new whippedCream(chocolateTwo);
        System.out.println(chocolateTwo.getDescription());
        System.out.println(chocolateTwo.cost());
    }
}
