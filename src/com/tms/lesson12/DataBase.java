package com.tms.lesson12;

public interface DataBase <T, R>{

    void save(T entity);

    T get(R id);

    T del(R id);

}
