package programs.inheritance_prog2;

public class Tetrahedron extends Luggage{
    private int side;

    public Tetrahedron(int s){
        super((float)(Math.pow(s,3) / (6*Math.pow(2,.5))), "Tetrahedron");
        this.side = s;
    }

    @Override
    public String toString(){
        return super.type + " ,volume:" + super.volume + " side:" + this.side;
    }
}
