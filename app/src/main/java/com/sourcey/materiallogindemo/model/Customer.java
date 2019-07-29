package com.sourcey.materiallogindemo.model;

import io.realm.RealmObject;

public class Customer extends RealmObject {
    String name;
    int marks;

    public String getName() {
        retur name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;

    }

    @Override
    public String toString() {
        return "Customer" +
                "name='" + name + " " +
                ", marks=" + marks +
                "\n";
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
