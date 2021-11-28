package com.tms.lesson2;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        //сортировка массива
        int [] unsortedArray = new int[]{4, 3, 5, 7, 21, 10};
        for (int j = 0; j < unsortedArray.length; j++){
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                int el = unsortedArray[i];
                if (el > unsortedArray[i + 1]) {
                    int left = el;
                    int right = unsortedArray[i + 1];
                    unsortedArray[i] = right;
                    unsortedArray[i + 1] = left;
                }


            }
        }
        System.out.println(Arrays.toString(unsortedArray));
    }
}
