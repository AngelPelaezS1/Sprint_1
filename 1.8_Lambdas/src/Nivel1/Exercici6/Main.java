package Nivel1.Exercici6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "Hello", "Marcos", "Antonio", "2", "3", "Lambdas","4","5", "Stream");
        System.out.println(strings);

        List<String> filteredList = strings.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(filteredList);





    }
}
