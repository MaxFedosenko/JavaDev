package com.tms.lesson7;

import java.util.*;

public class NumberService implements Number{

    @Override
    public void SearchNumber(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer key : list) {
            map.put(key, Collections.frequency(list, key));
        }
        System.out.println(map);
    }

}
