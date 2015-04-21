package ro.teamnet.zerotohero.oop.graphicshape.runapp;

import ro.teamnet.zerotohero.gc.DemoObject;
import ro.teamnet.zerotohero.gc.Immutable;
import ro.teamnet.zerotohero.oop.graphicshape.*;
import ro.teamnet.zerotohero.oop.graphicshape.cavans.Cavans;

import java.util.Objects;

/**
 * Created by my comp on 21.04.2015.
 */
public class RunApp {

    public static void main(String[] args) {
        Circles cerc = new Circles();
        System.out.println("the default circle area is " + cerc.getAreaPub());
        cerc.getAreaDef();

        Cavans cav  = new Cavans();
        //return cav.getArea();

        Circle c = new Circle();

        Shape forma = new Circle(10);
        System.out.println("Circle" + forma.area());

        ShapeBehaviour shB = new Square(10);
        System.out.println("shape behaviour" + shB.area());

        Object p1 = new Point(10,20);
        Object p2 = new Point(50,100);
        Object p3 = new Point(10,20);
        System.out.println("p1 equals p2 is " + p1.equals(p2));
        System.out.println("p1 equals p3 is " + p1.equals(p3));

        Point3D treid = new Point3D(3,4,5);
        Immutable imm =new Immutable("abcd");

        System.out.println(c.toString());
    }
}