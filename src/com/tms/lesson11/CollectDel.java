package com.tms.lesson11;

import java.util.List;

public class CollectDel implements Runnable {

    private List<Integer> list;

    public CollectDel(List<Integer> list) {
        this.list = list;
    }

    public void collectDel () {
        while (true) {
            if (list.size() > 0) {
                del();
                System.out.println(list.toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    synchronized void del() {
        int i = list.size() - 1;
        int el = list.get(i);
        list.remove(i);
        System.out.println("element has been delete: " + el);
    }

    @Override
    public void run() {
        collectDel();
    }
}
