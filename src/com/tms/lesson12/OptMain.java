package com.tms.lesson12;

import java.util.Optional;

public class OptMain {

    public static void main(String[] args) {
        Country country1 = new Country("RB", new Region("GomR", new City("Zhlobin", new Street("Central"))));
        Country country2= new Country("RB", new Region("GomR", null));
        String name1 = country1.getRegion().getCity().getName();

//        Country country = Optional.ofNullable(country2)
//                .get();
//
//        Country country3 = Optional.ofNullable(country2)
//                .orElse(new Country("test", null));
//
//        Optional.ofNullable(country2).orElseThrow(RuntimeException::new);

        Optional.ofNullable(country2).orElseGet(() -> new Country("asdf", null));

        String default_street = Optional.ofNullable(country2)
                .map(country -> country.getRegion())
                .map(region -> region.getCity())
                .map(city -> city.getName())
                .orElse("default street");


        System.out.println(default_street);
//        System.out.println(name2);
    }

}
