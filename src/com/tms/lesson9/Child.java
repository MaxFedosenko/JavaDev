package com.tms.lesson9;

public class Child {

    private String name;
    public boolean sex;

    public Child(String name, boolean sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Child child = (Child) o;

        if (sex != child.sex) return false;
        return name != null ? name.equals(child.name) : child.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sex ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
