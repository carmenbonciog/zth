package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by my comp on 21.04.2015.
 */
public class Circle extends Shape {
    private int xPos;
    private int yPos;
    private int radius;

    public Circle(){
        this.xPos = 10;
        this.yPos = 20;
        this.radius = 3;
    }
    public Circle(int xPos){
        this.xPos = xPos;
    }

    public Circle(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Circle(int xPos, int yPos, int radius){
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    public void fillColor (){
        System.out.println(this.color);
    }


    public void fillColor (int a){
        this.color = a;
        System.out.println("the circle colore is now "+this.color);

    }

    public void fillColor (float b){

        this.saturation = b;
    }



    @Override
    public String toString() {
        return "center = ("+ xPos + "," + yPos+")and radius = "+radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}
