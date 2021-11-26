package com.tms.lesson4;

public class WorkingWithAnArray {
    public static void main(String[] args) {
        Array array = new Array();
        int [] arr = {357, 498, 264, 228, 121, 56, 28, 27, 64, 2, 1, 3};
        array.searchNumber(arr);
        array.sort(arr);
        array.max(arr);
    }
}
