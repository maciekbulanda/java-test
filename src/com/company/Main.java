package com.company;
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("main thread");
        MyThread t = new MyThread();
        t.start();
        scanner.nextLine();
        t.stop = true;
    }
}
