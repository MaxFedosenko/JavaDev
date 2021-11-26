package com.tms.lesson2;

import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        //пока не введут exit
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            String x = scanner.nextLine();
            isExit = x.equals("exit");
            System.out.println(x);
        }
    }
}
