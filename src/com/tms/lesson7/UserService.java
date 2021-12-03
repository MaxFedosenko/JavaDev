package com.tms.lesson7;

import java.util.*;

public class UserService implements Service {
    @Override
    public Set<User> SearchName(Set<User> list, String name) {
        Set<User> userList = new TreeSet<>();
        for (User user : list) {
            if (user.getName().equals(name)) {
                userList.add(user);
            }
        }
        return userList;
    }

    @Override
    public Set<User> SearchSex(Set<User> list, SEX sex) {
        Set<User> userList = new TreeSet<>();
        for (User user : list) {
            if (user.getSex().equals(sex)) {
                userList.add(user);
            }
        }
        return userList;
    }

    @Override
    public List<User> SortList(List<User> list) {
        UserAge userAge = new UserAge();
        list.sort(userAge);
        return list;
    }
}
