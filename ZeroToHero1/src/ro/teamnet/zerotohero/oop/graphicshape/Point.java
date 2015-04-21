package ro.teamnet.zerotohero.oop.graphicshape;

import java.util.Objects;

/**
 * Created by my comp on 21.04.2015.
 */
public class Point {

    private int xPos;
    private int yPos;

    public Point(int yPos, int xPos) {
        this.yPos = yPos;
        this.xPos = xPos;
    }

    @Override
    public boolean equals (Object other){
        if (other == null)
            return false;
        if (other instanceof Point){
            Point anotherPoint = (Point) other;
            if ((xPos == anotherPoint.xPos) && (yPos == anotherPoint.yPos))
                return true;

        }
        return false;
    }

}
