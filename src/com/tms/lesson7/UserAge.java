package com.tms.lesson7;

import java.util.Comparator;
import java.util.Set;

public class UserAge implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getAge() - o2.getAge();
    }

    public Set<User>  UserAgeSort(Set<User> userSet) {
        for (User user : userSet) {
            System.out.println(user);
        }
        return userSet;
    }
}
