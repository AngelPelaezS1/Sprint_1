package Nivel1.Exercici1.Main;

import Nivel1.Exercici1.Moduls.NoGenericMethods;

public class Main {

    public static void main(String[] args) {
        NoGenericMethods names = new NoGenericMethods("Angel", "Juan", "Marco");
        System.out.println(names);

        System.out.println("Name1: " +names.getName1());
        System.out.println("Name2: " +names.getName2());
        System.out.println("Name3: " +names.getName3());

        names.setName1("Anna");
        names.setName2("Fernando");
        names.setName3("Jofre");

        System.out.println(names);
    }
}
