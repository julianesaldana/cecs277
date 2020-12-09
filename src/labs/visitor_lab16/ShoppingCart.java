package labs.visitor_lab16;
public class ShoppingCart implements ShoppingCartVisitor {
  private double cartTotal;
  
  public ShoppingCart() {
    cartTotal = 0;
  }
  public double visit(Magazine magazine) {
    double magPrice = 0;
    if(magazine.getPrice() > 5.00){
      magPrice = magazine.getPrice() * 0.9;
      cartTotal += magPrice;
    }
    else{
      magPrice = magazine.getPrice();
      cartTotal += magPrice;
    }
    System.out.println("Magazine :: " + magazine.getTitle() + " " + magazine.getVdate() + " cost = " + magPrice);
    return magPrice;
  }

  public double visit(Fruit fruit) {
    double fruitPrice = fruit.getPrice() * fruit.getAmount();
    cartTotal += fruitPrice;
    System.out.println(fruit.getName() + " unit price " + fruit.getPrice() + " amount " + fruit.getAmount() + " cost = " + fruitPrice);
    return fruitPrice;
  }

  public double getCartTotal(){
    return cartTotal;
  }
}