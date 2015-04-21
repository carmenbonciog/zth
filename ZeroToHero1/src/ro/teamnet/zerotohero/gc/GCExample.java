package ro.teamnet.zerotohero.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by my comp on 21.04.2015.
 */
public class GCExample {

    public void exceptie() throws MyExceplion {
        throw new MyExceplion();

    }

    public void exceptieNoua(){
        try {
            throw new MyExceplion();
        } catch (MyExceplion myExceplion) {
            myExceplion.printStackTrace();
        }
        finally {

        }

    }

    public void exceptie2() throws MyExceplion{
        try {
            throw new MyExceplion();

        }
        finally {

        }

    }


    public static void main(String[] args) {
//        while (true){
//            new DemoObject();
//        }
        List<DemoObject> demoObjects = new ArrayList<DemoObject>();
        while(true){
            demoObjects.add(new DemoObject());
        }
    }
}
