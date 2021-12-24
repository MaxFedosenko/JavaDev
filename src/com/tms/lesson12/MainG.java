package com.tms.lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainG {

    public static void main(String[] args) {

        List<String > list = new ArrayList<>();

        list.add("text");

        String s = list.get(0);

        GenMethod genMethod = new GenMethod();
        Integer text = genMethod.<String, Integer>convert("text", 20);
        Boolean convert = genMethod.<Integer, Boolean>convert(10, true);

        DataBase<User, Integer> dataBase = new UserDataBase();
        dataBase.save(new User());
        User user = dataBase.get(10);

        List<Pet> pets = new ArrayList<>();

        List<Animal> animals = new ArrayList<>();

        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();

        AnimalService animalService = new AnimalService();


        List<? super Pet> extPets = new ArrayList<>();



        extPets.add(new Pet());

        GenService<Dog> genService = new GenService<>();







    }

}
