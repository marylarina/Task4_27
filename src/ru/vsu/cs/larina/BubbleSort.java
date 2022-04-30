package ru.vsu.cs.larina;

import java.util.Comparator;

public class BubbleSort {
    public static <T extends Comparable<T>> void sort(T[] data, int from, int to){
        Comparator<T> c = Comparable::compareTo;
        int size = data.length;
        for (int i = from+1; i <= to - 1; i++) {
            for (int j = to - 1; j >= i; j--) {
                if (c.compare(data[j - 1], data[j])>0) {
                    T tmp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }
    public static <T extends Comparable<T>> void output(T[] data) {
        for(int i=0; i< data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}
