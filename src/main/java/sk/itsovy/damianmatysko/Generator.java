package sk.itsovy.damianmatysko;

import java.util.Random;

public class Generator {
    public Generator(int number) {
        Random rnd= new Random();
        System.out.println(rnd.nextInt(number));
    }

}
