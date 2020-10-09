package programs.inheritance_prog2;

public class Cube extends Luggage{
    private int side;

    public Cube(int s) {
        super((float)(Math.pow(s, 3)), "Cube");
        this.side = s;
    }

    @Override
    public String toString(){
        return super.type + " ,volume:" + super.volume + " sides:" + this.side;
    }
}
