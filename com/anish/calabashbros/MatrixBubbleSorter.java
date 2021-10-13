package com.anish.calabashbros;

public class MatrixBubbleSorter<T extends Comparable<T>> implements MatrixSorter<T> {
    @Override
    public void load(T[][] elements) {
        this.a = elements;
    }

    @Override
    public void sort() {
        for (T[] line : a) {
            BubbleSorter<T> b = new BubbleSorter<T>();
            b.load(line);
            b.sort();
            plan += b.getPlan();
        }
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

    private T[][] a;
    private String plan = "";
}
