package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by my comp on 21.04.2015.
 */
public class Shape extends AbstractShape implements ShapeBehaviour{

    public void setColor(int color) {
        this.color = color;
    }

    protected int color;

    public void setSaturation(float saturation) {
        this.saturation = saturation;
    }

    protected float saturation;

    public double returneaza(){
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }
}
