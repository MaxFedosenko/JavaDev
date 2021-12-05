package com.tms.lesson8;

import java.util.List;

public class UserService implements Service {

    @Override
    public void addElement(DataBaseColl dataBaseColl, String text) {
        List<String> stringList = dataBaseColl.stringList;
        if (dataBaseColl.stringList.size() < 5) {
            dataBaseColl.stringList.add(text);
            System.out.println("your element" + " " + text + " " + "has been added");
        } else {
            throw new MemoryIsFull();
        }
    }


    @Override
    public void getDelElement(DataBaseColl dataBaseColl) {
        List<String> stringList = dataBaseColl.stringList;
        if (dataBaseColl.stringList.size() <= 5 && dataBaseColl.stringList.size() != 0) {
            System.out.println(dataBaseColl.stringList.get(dataBaseColl.stringList.size() - 1));
            dataBaseColl.stringList.remove(dataBaseColl.stringList.size() - 1);
        } else {
            throw new MemoryIsEmpty();
        }
    }
}
