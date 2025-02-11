package Nivell2_Exercici2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);


        System.out.println("Iterating through ArrayList whith iterator");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Iterating in reverse order");
        ListIterator<Integer> listIterator = numbers.listIterator(numbers.size());
        while(listIterator.hasPrevious()){
            int number = listIterator.previous();
            System.out.println(number);
            numbers1.add(number);
        }

        System.out.println("Second ArrayList in reverse order");
        for(int num : numbers1){
            System.out.println(num);
        }
    }
}
