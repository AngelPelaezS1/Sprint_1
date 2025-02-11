package Nivell1_Exercici1.Main;

import Nivell1_Exercici1.Moduls.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Month> year = new ArrayList<Month>();

        year.add(new Month("January"));
        year.add(new Month("February"));
        year.add(new Month("March"));
        year.add(new Month("April"));
        year.add(new Month("May"));
        year.add(new Month("June"));
        year.add(new Month("July"));
        year.add(new Month("September"));
        year.add(new Month("October"));
        year.add(new Month("November"));
        year.add(new Month("December"));

        year.add(7, new Month("August"));

        System.out.println("ArrayList ordenado:");
        for (Month month : year) {
            System.out.println(month);
        }

        HashSet<Month> monthHashSet = new HashSet<Month>(year);
        System.out.println("HashSet con los meses:");
        for (Month month : monthHashSet) {
            System.out.println(month);
        }

        System.out.println("Recorriendo el HashSet con Iterator:");
Iterator<Month> iterator = monthHashSet.iterator();
        if (iterator.hasNext()) {
           do {
        System.out.println(iterator.next());
           } while (iterator.hasNext());
        } else {
         System.out.println("El HashSet está vacío.");
}

        }
    }
}
