package Nivel1.Exercici8;

public class Main {

    public static void main(String[] args) {

        String string = "Lambda reverse method";

        ReverseMethod reverseWord = (a) -> new StringBuilder(a).reverse().toString();
        System.out.println(reverseWord.reverse(string));

    }
}
