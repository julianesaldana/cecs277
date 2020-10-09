package programs.inheritance_prog2;

public class Pyramid extends Luggage{   // non rectangular pyramid
    private int base;   // area
    private int height;

    public Pyramid(int b, int h){
        super((float)(b*h/3), "Pyramid");
        this.base = b;
        this.height = h;
    }

    @Override
    public String toString(){
        return super.type + " ,volume:" + super.volume + " base:" + this.base + " height:" + this.height;
    }
}
