package com.tms.lesson7;

import java.util.*;

public class WorkWithCollections {

    public static void main(String[] args) {

        User user1 = new User("Harry", 15, SEX.MEN);
        User user2 = new User("Tony", 28, SEX.MEN);
        User user3 = new User("Natasha", 17, SEX.WOMAN);
        User user4 = new User("Jonny", 6, SEX.MEN);
        User user5 = new User("Julia", 20, SEX.WOMAN);
        User user6 = new User("Julia", 2, SEX.WOMAN);

        Service service = new UserService();

        List<User> userList = new LinkedList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
//        System.out.println(service.SearchName(userList, "Natasha"));
//        System.out.println(service.SearchName(userList, "Natash"));
//        System.out.println(service.SearchSex(userList, SEX.MEN));
//        System.out.println(service.SearchSex(userList, SEX.WOMAN));
        System.out.println(service.SortList(userList));

        System.out.println("________________________________________");

        List<User> userArray = new ArrayList<>();
        userArray.add(user1);
        userArray.add(user2);
        userArray.add(user3);
        userArray.add(user4);
        userArray.add(user5);
        userArray.add(user6);
//        System.out.println(service.SearchName(userArray, "Jonny"));
//        System.out.println(service.SearchName(userArray, "John"));
//        System.out.println(service.SearchSex(userArray, SEX.MEN));
//        System.out.println(service.SearchSex(userArray, SEX.WOMAN));
        System.out.println(service.SortList(userArray));

        System.out.println("__________________________________________");


        Set<User> userTree = new TreeSet<>();
        UserAge userAge = new UserAge();
        userTree.add(user1);
        userTree.add(user2);
        userTree.add(user3);
        userTree.add(user4);
        userTree.add(user5);
        userTree.add(user6);
        System.out.println(service.SearchName(userTree, "Tony"));
        System.out.println(service.SearchName(userTree, "Ton"));
        System.out.println(service.SearchSex(userTree, SEX.MEN));
        System.out.println(service.SearchSex(userTree, SEX.WOMAN));
        System.out.println(userAge.UserAgeSort(userTree));

        System.out.println("____________________________________");

        Set<User> userHash = new HashSet<>();
        userHash.add(user1);
        userHash.add(user2);
        userHash.add(user3);
        userHash.add(user4);
        userHash.add(user5);
        userHash.add(user6);
        System.out.println(service.SearchName(userHash, "Julia"));
        System.out.println(service.SearchName(userHash, "Hary"));
        System.out.println(service.SearchSex(userHash, SEX.MEN));
        System.out.println(service.SearchSex(userHash, SEX.WOMAN));

        System.out.println("___________________________________________");


        Number number = new NumberService();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(1);
        numbers.add(2);
        number.SearchNumber(numbers);
        System.out.println("");



    }

}
