package labs.inheritance_lab3;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height){
        super(x, y, width, height);
    }

    public double getPerimeter(){
        return getWidth()* 2 + getHeight() * 2;
    }

    public double getArea(){
        return getWidth() * getHeight();
    }
}
