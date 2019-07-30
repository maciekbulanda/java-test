package com.company;
import java.lang.*;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Deque<Integer> lista = new ArrayDeque<>();
        for (int i=0; i < num; i++) {
            String cmd = scanner.next();
            int nmbr=0;
            switch (cmd) {
                case "push" :
                    nmbr = scanner.nextInt();
                    lista.push(nmbr);
                    break;
                case "pop" :
                    lista.pop();
                    break;
                case "max" :
                    Stream<Integer> str = lista.stream();
                    System.out.println(str.reduce(BinaryOperator.maxBy(Comparator.naturalOrder())).get());
                default:
            }
        }
    }
}
