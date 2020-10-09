package programs.inheritance_prog2;

public class Cylinder extends Luggage{
    private int radius;
    private int height;

    public Cylinder (int r, int h){
        super((float)(Math.PI * h * Math.pow(r,2)), "Cylinder");
        this.radius = r;
        this.height = h;
    }

    @Override
    public String toString(){
        return super.type + " ,volume:" + super.volume + " radius:" + this.radius + " height:" + this.height;
    }
}
