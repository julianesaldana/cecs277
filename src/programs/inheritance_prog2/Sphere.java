package programs.inheritance_prog2;

public class Sphere extends Luggage{
    private int radius;

    public Sphere(int r){
        super((float)(Math.PI * Math.pow(r, 2)), "Sphere");
        this.radius = r;
    }

    @Override
    public String toString(){
        return super.type + " ,volume:" + super.volume + " radius:" + this.radius;
    }
}
