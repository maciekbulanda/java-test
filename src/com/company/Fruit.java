package com.company;

import java.util.Comparator;

public class Fruit<T extends Fruit> implements Comparable<T> {
    private final int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }
    @Override
    public int compareTo(T o) {
        return Integer.compare(this.weight, o.getWeight());
    }
    public int getWeight() {
        return this.weight;
    }
}
