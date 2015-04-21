package ro.teamnet.zerotohero.gc;

import java.util.Random;

/**
 * Created by my comp on 21.04.2015.
 */
public class DemoObject {

    private static final int bufferSize = 100000;
    private String temp;
    private String objectRef;
    private static int count = 0;

    public DemoObject(){
        if (count >= 5)
            try {
                finalize();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        this.temp = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        this.count ++;
        this.objectRef = this.toString();

        System.out.println(count);
    }

}
