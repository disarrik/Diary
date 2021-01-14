package com.example.diary;

public class School {
    private Employee employes[];
    private Teacher teachers[];
    private Learner learners[];
    private String adress;
    private String name;
    private Class classes[];
    private Elective Electives[];
    private Section Sections[];
    private Journal journal;

    public Teacher[] getListTeachers() {
        return teachers;
    }
    public Employee[] getListEmployeers() {
        return employes;
    }
    public Learner[] getListLearners() {
        return learners;
    }
    public Journal getElectronicJournal() {
        return journal;
    }
    public Participant[] getParticipant() {
        // TODO: 14.01.2021 составить список всех людей с пропусками (класс Participant)
        Participant[] participants = new Participant[4];
        return participants;
    }
}
