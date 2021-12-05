package com.tms.lesson8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DataBaseColl dataBaseColl = new DataBaseColl();
        Service service = new UserService();
        Scanner scanner = new Scanner(System.in);

        boolean isExit = false;
        while (!isExit) {
            String txt = scanner.nextLine();
            if (txt.equals("exit")) {
                System.out.println("bye");
                break;
            } else if (txt.equals("word")) {
                System.out.println("this element can't be added");
                System.out.println("max size of memory is " + (5 - dataBaseColl.stringList.size()));
            } else if (txt.equals("get")) {
                try {
                    service.getDelElement(dataBaseColl);
                } catch (MemoryIsEmpty memoryIsEmpty) {
                    System.out.println("CAUTION! MEMORY IS EMPTY");
                }
            } else {
                try {
                    service.addElement(dataBaseColl, txt);
                } catch (MemoryIsFull memoryIsFull) {
                    System.out.println("CAUTION! MEMORY IS FULL");
                }
            }
        }
    }
}