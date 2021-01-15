package com.example.diary;

public class Participant extends Person{
    protected int cardID;

    Participant(String fullName, int phone, int cardID) {
        super(fullName, phone);
        this.cardID = cardID;
    }

    public int getCardID() {
        return cardID;
    }
}
