package com.tms.lesson4;

public class User {
    public String name;
    public int age;
    public boolean isMan;

    public User() {
        this.name = USERENUM.NAME.name;
        this.age = USERENUM.AGE.age;
        this.isMan = USERENUM.ISMAN.isMan;
    }

    public int agePlus(int age) {
        return age += 1;
    }

    class Address {
        public String country;
        public String city;

        public Address(String country, String city) {
            this.country = country;
            this.city = city;
        }

        public String AddressInfo() {
            return country + " " + city;
        }
    }

    public String Info() {
        Address address = new Address("Belarus", "Zhlobin");
        return name + " " + age + " " + isMan + " " + address.AddressInfo();
    }
}
