//Hunter Lewis
// Julian Saldana
// Eric Dao
// Isabel Guzman
//Demoed at 4:17 PM
// Lab 14 277 Gold

package labs.lab14;

public class main_lab14 {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("12343", 10);
        Item item2 = new Item("2345", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("shitass@gmail.com", "password"));
        cart.pay(new CreditCardStrategy("shitass", "6969", "420", "4/20/2020"));
    }
}
