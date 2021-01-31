package com.example.diary;

import java.util.Arrays;

public class School {
    private static Employee employees[] = {};
    private static Teacher teachers[] = {};
    private static Learner learners[] = {};
    private static String address = "344000, г. Ростов-на-Дону, ул. Знаний, д.1";
    private static String name = "Школа";
    private static Class classes[] = {};
    private static Elective electives[] = {};
    private static Section sections[] = {};
    private static Journal journal;

    public static Teacher[] getListTeachers() {
        return teachers;
    }

    public static Employee[] getListEmployees() {
        return employees;
    }

    public static Learner[] getListLearners() {
        return learners;
    }

    public static Journal getElectronicJournal() {
        return journal;
    }

    public static Participant[] getParticipant() {
        Participant[] participants = new Participant[employees.length + teachers.length + learners.length];
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            participants[counter] = employees[i];
            counter++;
        }
        for (int i = 0; i < teachers.length; i++) {
            participants[counter] = teachers[i];
            counter++;
        }
        for (int i = 0; i < learners.length; i++) {
            participants[counter] = learners[i];
            counter++;
        }
        return participants;
    }

    public static void addTeacher(String fullName, int phone, int cardID, String position, String qualification) {
        Teacher newTeacher = new Teacher(fullName, phone, cardID, position, qualification);
        teachers = Arrays.copyOf(teachers, teachers.length + 1);
        teachers[teachers.length-1] = newTeacher;
    }

    public static void addEmployee(String fullName, int phone, int cardID, String position) {
        Employee newEmployee = new Employee(fullName, phone, cardID, position);
        employees = Arrays.copyOf(employees, employees.length + 1);
        employees[employees.length-1] = newEmployee;
    }
    
    public static void addLearner(String fullName, int phone, int cardID, Parent[] parents) {
        Learner newLearner = new Learner(fullName, phone, cardID, parents);
        learners = Arrays.copyOf(learners, learners.length + 1);
        learners[learners.length-1] = newLearner;
    }

    public static void addClass(String number, Teacher classTeacher, Learner[] learners) {
        Class newClass = new Class(number, classTeacher, learners);
        classes = Arrays.copyOf(classes, classes.length + 1);
        classes[classes.length-1] = newClass;
    }

    public static void addElective(String academicSubject, Learner[] learners, Teacher classTeacher) {
        Elective newElective = new Elective(academicSubject, learners, classTeacher);
        electives = Arrays.copyOf(electives, electives.length + 1);
        electives[electives.length-1] = newElective;
    }

    public static void addSection(String name, Learner[] learners, Teacher classTeacher) {
        Section newSection = new Section(name, learners, classTeacher);
        sections = Arrays.copyOf(sections, sections.length + 1);
        sections[sections.length-1] = newSection;
    }


}
