package com.tms.lesson11;

import java.util.ArrayList;
import java.util.List;

public class CollectMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Thread thread1 = new Thread(new CollectAdd(list));
        Thread thread2 = new Thread(new CollectDel(list));

        thread1.start();
        thread2.start();

    }

}
