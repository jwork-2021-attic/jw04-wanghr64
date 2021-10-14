package com.anish.calabashbros;

public class MatrixBubbleSorter<T extends Comparable<T>> implements MatrixSorter<T> {
    @Override
    public void load(T[][] elements) {
        this.a = elements;
        rows = elements.length;
        cols = elements[1].length;
    }

    private void swap(int i, int j) {
        T temp;
        temp = a[i / cols][i % cols];
        a[i / cols][i % rows] = a[j / cols][j % cols];
        a[j / cols][j % cols] = temp;
        plan += "" + a[i / cols][i % cols] + "<->" + a[j / cols][j % cols] + "\n";
    }

    @Override
    public void sort() {
        boolean sorted = false;
        int size = a.length * a[0].length;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < size - 1; i++) {
                if (a[i / cols][i % cols].compareTo(a[(i + 1) / cols][(i + 1) % cols]) > 0) {
                    swap(i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

    private T[][] a;
    private int rows;
    private int cols;
    private String plan = "";
}
