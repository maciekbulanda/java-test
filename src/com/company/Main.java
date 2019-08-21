package com.company;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple(10);
        Apple apple2 = new Apple(13);
        System.out.println(apple2.compareTo(apple1));
        Orange orange1 = new Orange(15);
        Orange orange2 = new Orange(11);
        System.out.println(orange1.compareTo(orange2));


    }
}
