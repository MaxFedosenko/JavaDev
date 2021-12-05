package com.tms.lesson9;

import java.util.List;

public class Family {

    private String name;
    List<Child> childList;

    public Family(String name, List<Child> childList) {
        this.name = name;
        this.childList = childList;
    }

    public String getName() {
        return name;
    }

    public List<Child> getChildList() {
        return childList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Family family = (Family) o;

        if (name != null ? !name.equals(family.name) : family.name != null) return false;
        return childList != null ? childList.equals(family.childList) : family.childList == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (childList != null ? childList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", childList=" + childList +
                '}';
    }
}
