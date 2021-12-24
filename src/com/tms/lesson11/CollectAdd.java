package com.tms.lesson11;

import java.util.List;

public class CollectAdd implements Runnable {

    private List<Integer> list;

    public CollectAdd(List<Integer> list) {
        this.list = list;
    }

    public void collectAdd() {
        while (true) {
            if (list.size() < 10) {
                add(list);
                System.out.println(list.toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    synchronized void add (List<Integer> list){
        int i = (int) (Math.random()*100);
        list.add(i);
        System.out.println("element has been added: " + i);
    }



    @Override
    public void run() {
        collectAdd();
    }
}
