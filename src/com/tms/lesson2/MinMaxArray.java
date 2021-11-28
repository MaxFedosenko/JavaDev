package com.tms.lesson2;

public class MinMaxArray {
    public static void main(String[] args) {
        //минимальное и максимальное значение в массиве
        int [] unsortedArray = new int[]{4, 3, 5, 7, 21, 10};
        int min = unsortedArray[0];
        int max = unsortedArray[0];
        for (int i = 0; i < unsortedArray.length; i++) {
            if (unsortedArray[i] < min) {
                min = unsortedArray[i];
            } else if (unsortedArray[i] > max) {
                max = unsortedArray[i];
            }
        }
        System.out.println("Min value is " + min);
        System.out.println("Max value is " + max);
    }
}
