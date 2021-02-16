package sk.itsovy.damianmatysko;
// anotacia
@FunctionalInterface
interface GeneratorInterface {
    Generator generate(int number5);
}

public class Main{
    public static void main(String[] args) {
        GeneratorInterface ref2 = Generator::new;
        System.out.println(ref2.generate(10));
    }
}
