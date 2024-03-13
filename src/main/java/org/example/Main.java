package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //filter all the strings that starts with capital letter
        //using filter() method
        String[] names = {"John", "alex", "Chris", "williams", "Mark", "Bob"};
        List<String> list = Stream.of(names)
                .filter(str -> Character.isUpperCase(str.charAt(0)))
                .toList();
        System.out.println("Names starting with capital letters are = " + list);

        //find the length of all words in the given array of strings
        //using map() method
        String[] words = {"HELLO", "WORLD", "JAVA", "PROGRAMMING"};
        List<Integer> wordLengths = Stream.of(words)
                .map(String::length)
                .toList();
        System.out.println("Length of all words in the list is = " + wordLengths);

        //using flatMap() method
        List<String> list1 = Stream.of("A", "B")
                .flatMap(str -> Stream.of(str, str.toLowerCase()))
                .toList();
        System.out.println(list1);

        //finding the sum of all elements in the given array of integers using reduce() method
        //using reduce() method
        int sum = Stream.of(1, 2, 3, 4, 5)
                .reduce(0, Integer::sum);
        System.out.println("Sum of all elements in the list is = " + sum);

        //using collect() method
        List<String> list2 = Stream.of("A", "B", "C", "D")
                .toList();
        System.out.println(list2);

        //using collect() method
        List<String> list3 = Stream.of("A", "B", "C", "D")
                .collect(Collectors.toList());
        System.out.println(list3);

        //finding the distinct elements in the given list of integers using distinct() method
        //using distinct() method
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 1, 2, 3);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .toList();
        System.out.println("Distinct numbers in the list is = " + distinctNumbers);

        //using count() method
        long count = Stream.of(1, 2, 3, 4, 5)
                .count();
        System.out.println("Count of elements in the list is = " + count);

        //using anyMatch() method
        boolean result = Stream.of(1, 2, 3, 4, 5)
                .anyMatch(num -> num % 2 == 0);
        System.out.println(result);

        //using allMatch() method
        boolean result1 = Stream.of(2, 5, 6, 8, 10)
                .allMatch(num -> num % 2 == 0);
        System.out.println(result1);

        //using noneMatch() method
        boolean result2 = Stream.of(1, 3, 5, 7, 9,10)
                .noneMatch(num -> num % 2 == 0);
        System.out.println(result2);

        //using findFirst() method
        Integer firstEvenNumber = Stream.of(1, 2, 3, 4, 5)
                .filter(num -> num % 2 == 0)
                .findFirst()
                .orElse(null);
        System.out.println("firstEvenNumber in the list is = " + firstEvenNumber);

        //using findAny() method
        Integer anyEvenNumber = Stream.of(1, 2, 3, 4, 5)
                .filter(num -> num % 2 == 0)
                .findAny()
                .orElse(null);
        System.out.println("anyEvenNumber in the list is = " + anyEvenNumber);

        //using max() method
        Integer max = Stream.of(1, 2, 3, 4, 5)
                .max(Integer::compareTo)
                .orElse(null);
        System.out.println("Max value in the list is: " + max);

        //using min() method
        Integer min = Stream.of(1, 2, 3, 4, 5)
                .min(Integer::compareTo)
                .orElse(null);
        System.out.println("Min value in the list is: " + min);

        //using sorted() method
        List<Integer> sortedNumbers = Stream.of(5, 3, 1, 2, 4)
                .sorted()
                .toList();
        System.out.println("sortedNumbers = " + sortedNumbers);

        //using forEach() method
        Stream.of(1, 2, 3, 4, 5)
                .forEach(System.out::println);

        //using peek() method
        List<Integer> peekedNumbers = Stream.of(1, 2, 3, 4, 5)
                .peek(System.out::println)
                .toList();

        //using skip() method
        List<Integer> skippedNumbers = Stream.of(1, 2, 3, 4, 5)
                .skip(2)
                .toList();
        System.out.println("skippedNumbers = " + skippedNumbers);

        //using limit() method
        List<Integer> limitedNumbers = Stream.of(1, 2, 3, 4, 5)
                .limit(3)
                .toList();
        System.out.println("limitedNumbers = " + limitedNumbers);

    }
}

