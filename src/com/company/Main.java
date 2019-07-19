package com.company;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("main threads");
        new Thread((Runnable) () -> System.out.println("test:" + Thread.currentThread().getName()),"my new thread").start();
    }
}
