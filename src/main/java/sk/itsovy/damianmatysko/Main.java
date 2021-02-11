package sk.itsovy.damianmatysko;
@FunctionalInterface
interface GeneratorInterface {
    Generator generate(int number);
}

public class Main{
    public static void main(String[] args) {
        GeneratorInterface ref2 = Generator::new;
        System.out.println(ref2.generate(10));
    }
}