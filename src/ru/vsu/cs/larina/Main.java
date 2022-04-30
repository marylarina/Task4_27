package ru.vsu.cs.larina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int size = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        Integer [] array = new Integer[size];
        for(int i=0; i<size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.print("Массив до сортировки: ");
        BubbleSort.output(array);
        System.out.println();
        System.out.print("Введите индекс первого элемента диапазона:");
        int from = scanner.nextInt();
        System.out.print("Введите индекс элемента, следующего за последним элементом диапазона:");
        int to = scanner.nextInt();
        BubbleSort.sort(array, from, to);
        BubbleSort.output(array);
    }
}
