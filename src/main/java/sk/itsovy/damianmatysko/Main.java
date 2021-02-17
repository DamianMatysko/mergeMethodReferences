package sk.itsovy.damianmatysko;
// anotacia
@FunctionalInterface
interface GeneratorInterface {
    Generator generate(int number5);
}

public class Main{
    public static void main(String[] args) {
        NumberIdentificator obj = new NumberIdentificator();
        NumberInterface ref = () -> obj.isEvenNumber(10);
        System.out.println(ref.resolve());
    }
}
