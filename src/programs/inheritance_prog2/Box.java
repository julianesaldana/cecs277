package programs.inheritance_prog2;

public class Box extends Luggage{
    private int length;
    private int width;
    private int height;

    public Box(int l, int w, int h) {           // overrides previous variables, avoids making setters and getters
        super((float)(l*w*h),"Box");        // can just use super.variables when accessing volume and type
        this.length = l;
        this.width = w;
        this.height = h;
    }

    @Override
    public String toString(){
        return super.type + " ,volume:" + super.volume + " length:" + this.length + " width:" + this.width + " height:" + this.height;
    }
}
