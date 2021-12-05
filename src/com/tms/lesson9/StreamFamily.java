package com.tms.lesson9;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFamily {

    public static void main(String[] args) {

        Family family1 = new Family("family1", Arrays.asList(
                new Child("child1.1", true),
                new Child("child1.2", false),
                new Child("child1.3", true)));

        Family family2 = new Family("family2", Arrays.asList(
                new Child("child2.1", false),
                new Child("child2.2", true),
                new Child("child2.3", false),
                new Child("child2.4", true)));

        Family family3 = new Family("family3", Arrays.asList(
                new Child("child3.1", false),
                new Child("child3.2", true),
                new Child("child3.3", false),
                new Child("child3.4", true),
                new Child("child3.5", false)));

        List<Family> familyList = Arrays.asList(family1, family2, family3);

        familyList.stream()
                .flatMap(family -> family.getChildList().stream())
                .filter(child -> child.getName().contains("2"))
                .forEach(System.out::println);
        System.out.println("___________________________________________");

        familyList.stream()
                .filter(family -> family.getChildList().size() > 3)
                .forEach(System.out::println);
        System.out.println("___________________________________________");

        familyList.stream()
                .flatMap(family -> family.getChildList().stream())
                .filter(Child::isSex)
                .forEach(System.out::println);
        System.out.println("______________________________________________");

        familyList.stream()
                .flatMap(family -> family.getChildList().stream())
                .filter(child -> !child.isSex())
                .forEach(System.out::println);
        System.out.println("_______________________________________________");

        familyList.stream()
                .flatMap(family -> family.getChildList().stream())
                .forEach(child -> System.out.println(child.getName().toUpperCase()));
        System.out.println("________________________________________________");

        long count = familyList.stream()
                .flatMap(family -> family.getChildList().stream())
                .count();
        System.out.println("all childes is " + count);
        System.out.println("__________________________________________________");

        Map<String, Integer> map = familyList.stream()
                .collect(Collectors.toMap(Family::getName, family -> family.getChildList().size()));
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }

}
