package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by my comp on 21.04.2015.
 */
public class Point3D extends Point {

    private int zPos;

    public Point3D(int yPos, int xPos, int zPos) {
        super(yPos, xPos);
        this.zPos = zPos;
    }
}
