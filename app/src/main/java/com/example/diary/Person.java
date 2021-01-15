package com.example.diary;

public class Person {
    protected String fullName;
    protected int phone;

    Person(String fullName, int phone) {
        this.fullName = fullName;
        this.phone = phone;
    }
    public String getFullName() {
        return this.fullName;
    }
    public int getPhone() {
        return this.phone;
    }
}
