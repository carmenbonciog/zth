package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by my comp on 21.04.2015.
 */
public class Square extends Shape {

    private int side;

    @Override
    public double area() {
        return side*side;
    }

    public Square (){
        side = 5;
    }

    public Square(int side) {
        this.side = side;
    }
}
