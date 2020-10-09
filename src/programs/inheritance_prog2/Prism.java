package programs.inheritance_prog2;

public class Prism extends Luggage{
    private int base;   // area
    private int height;

    public Prism(int b, int h){
        super((float)(b*h/2), "Prism");
        this.base = b;
        this.height = h;
    }

    @Override
    public String toString(){
        return super.type + " ,volume:" + super.volume + " base:" + this.base + " height:" + this.height;
    }
}
