package com.example.diary;

public class Learner extends Participant{
    protected Parent[] parents;

    Learner(String fullName, int phone, int cardID, Parent[] parents) {
        super(fullName, phone, cardID);
        this.parents = parents;
    }

    public Parent[] getParents() {
        return this.parents;
    }
}
