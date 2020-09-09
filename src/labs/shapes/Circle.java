package labs.shapes;

public class Circle extends Shape{
    private int radius;

    public Circle(int x, int y, int r){
        super(x, y);
        radius = r;
    }

    public void display(){
        System.out.println("Circle");
    }
}
