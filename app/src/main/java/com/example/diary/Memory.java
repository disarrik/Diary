package com.example.diary;

public interface Memory {
    Employee[] getEmployes();
    Teacher[] getTeachers();
    Learner[] getLearners();
    String getAdress();
    String getName();
    Class[] getClasses();
    Elective[] getElectives();
    Section[] getSections();
}
