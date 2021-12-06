package com.tms.lesson7;

import java.util.List;
import java.util.Set;

public interface Service {

    Set<User> SearchName (Set<User> list, String name);

    Set<User> SearchSex (Set<User> list, SEX sex);

    List<User> SortList (List<User> list);



}
