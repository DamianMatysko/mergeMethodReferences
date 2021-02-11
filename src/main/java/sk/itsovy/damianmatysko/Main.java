package sk.itsovy.damianmatysko;

public class Main {
    public static void main(String[] args) {
        NumberIdentificator obj = new NumberIdentificator();
        NumberInterface ref = () -> obj.isEvenNumber(10);
        System.out.println(ref.resolve());
    }
}
