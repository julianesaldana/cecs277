package labs.visitor_lab16;
// Lab Partners
//
// Josiah Rojas
// Jared Deaton
// Michael Gonzales
// Julian Saldana
// Demo time: 5:42 p.m.

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<ItemElement> items = new ArrayList<>();
        ShoppingCart shoppingCart = new ShoppingCart();
        Fruit apple = new Fruit("Apple", 20, 3.05);
        Magazine thrasher = new Magazine("Thrasher", "May 2020", 6.3);
        items.add(apple);
        items.add(thrasher);
        for (ItemElement item : items) {
            item.accept(shoppingCart);

        }
        double total = shoppingCart.getCartTotal();
        System.out.println("Total Cost = " + total);
    }
}