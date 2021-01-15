package com.example.diary;

public class Employee extends Participant{
    protected String position;

    Employee(String fullName, int phone, int cardID, String position) {
        super(fullName, phone, cardID);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
