package com.example.diary;

public class Teacher extends Participant{
    protected String position;
    protected String qualification;

    Teacher(String fullName, int phone, int cardID, String position, String qualification) {
        super(fullName, phone, cardID);
        this.position = position;
        this.qualification = qualification;
    }

    public String getPosition() {
        return this.position;
    }
    public String getQualification() {
        return this.qualification;
    }
}
