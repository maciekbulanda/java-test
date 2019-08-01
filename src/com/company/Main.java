package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        Map<String,Integer> list = new HashMap<>();
        for (String word : words) {
            if (list.containsKey(word)) {
                int n = list.get(word);
                list.put(word,++n);

            } else {
                list.put(word, 1);
            }
        }
        System.out.println(list);
    }
}