package com.tms.lesson4;

import java.util.Arrays;

public class Array {
    public void sort(int [] arr) {
        sortArray(arr);
    }
    public void max(int [] arr) {
        maxArray(arr);
    }
    public void searchNumber (int [] arr) {
        searchNumberArray(arr);
    }

    private void sortArray(int [] arr) {
        int value;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    value = arr[j];
                    arr[j] = arr[i];
                    arr[i] = value;
                }
            }
        }
        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }
    private void maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max value is " + max);
    }
    private void searchNumberArray (int [] arr) {
        int num = arr[5];
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == num) {
                num = arr[i];
                arr[i] = num;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Fifth element of array = " + num);

    }
}
