package programs.inheritance_prog2;

public class Cone extends Luggage {
    private int radius;
    private int height;

    public Cone(int r, int h){
        super((float)(Math.PI*Math.pow(r,2)*h/3), "Cone");
        this.radius = r;
        this.height = h;
    }

    @Override
    public String toString(){
        return super.type + " ,volume:" + super.volume + " radius:" + this.radius + " height:" + this.height;
    }
}
