package labs.visitor_lab16;

public interface ItemElement {
  public double accept(ShoppingCartVisitor visitor);
}