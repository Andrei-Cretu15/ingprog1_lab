package org.example;
import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //problema 1
        List<Integer> numbers=new Random().ints(10,5,26).boxed().collect(Collectors.toList());
        System.out.println("lista originala: "+numbers);

        int sum=numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("suma: "+sum);

        int max = numbers.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
        int min = numbers.stream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE);
        System.out.println("max: "+max);
        System.out.println("min: "+min);

        List<Integer>listafiltrata=numbers.stream().filter(x->x>10).collect(Collectors.toList());
        System.out.println("lista filtrata: "+listafiltrata);

        List<Double>doubleslList=numbers.stream().map(Double::valueOf).collect(Collectors.toList());
        System.out.println("list of doubles: "+doubleslList);

        boolean contains12=numbers.contains(12);
        System.out.println("contine 12: "+contains12);

        //problema 2

        List<Integer> numere = Arrays.asList(9, 10, 3, 4, 7, 3, 4);


        List<Integer> squaredDistinct = numere.stream()
                .map(n -> n * n) // Compute square
                .distinct()      // Retain distinct values
                .collect(Collectors.toList());

        System.out.println("elemente distincte: " + squaredDistinct);

        //problema 3


        List<String> words = Arrays.asList("Acesta", "este", "un", "program", "scris", "cu", "java", "8", "si", "expresii", "lambda");


        List<String> longWords = words.stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.toList());
        System.out.println("Words with length >= 5: " + longWords);


        List<String> sortedWords = longWords.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted words: " + sortedWords);


        String wordStartingWithP = words.stream()
                .filter(word -> word.startsWith("p"))
                .findFirst()
                .orElse("No word found");
        System.out.println("Word starting with 'p': " + wordStartingWithP);


    }
}