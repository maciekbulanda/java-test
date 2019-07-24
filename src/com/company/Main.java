package com.company;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        List<Integer> lista = new ArrayList<>();
        while ((num = scanner.nextInt()) != 0) {
            lista.add(num);
        }
        Stream<Integer> str = lista.stream();
        str.distinct().sorted().forEach(System.out::println);
    }
}
