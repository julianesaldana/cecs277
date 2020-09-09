package labs.shapes;

public class Shape {
    private int x;
    private int y;

    public Shape (int x, int y){
        this.x = x;
        this.y = y;
    }

    public void display(){
        System.out.printf("x is %s and y is %s", x, y);
    }
}
