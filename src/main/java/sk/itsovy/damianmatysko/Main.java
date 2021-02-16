package sk.itsovy.damianmatysko;

public class Main {
    public static void main(String[] args) {
        NumberIdentificator obj = new NumberIdentificator();
        NumberInterface refer = () -> obj.isEvenNumber(10);
        // comment
        System.out.println(refer.resolve());
    }
}
