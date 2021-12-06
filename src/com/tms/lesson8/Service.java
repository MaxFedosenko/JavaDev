package com.tms.lesson8;

import java.util.List;

public interface Service {

    void addElement(DataBaseColl dataBaseColl, String text) throws MemoryIsFull;
    void getDelElement(DataBaseColl dataBaseColl) throws MemoryIsEmpty;

}
