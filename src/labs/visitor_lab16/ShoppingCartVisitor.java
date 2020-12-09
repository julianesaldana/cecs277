package labs.visitor_lab16;
public interface ShoppingCartVisitor {
  public double visit(Magazine magazine);
  public double visit(Fruit fruit);
}