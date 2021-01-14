package com.example.diary;

public class Class {
    private String number;
    private Teacher classTeacher;
    private Learner[] learners;

    public Teacher getClassTeacher() {
        return classTeacher;
    }
    public String getListString() {
        String list = "";
        return list;
    }
    public Learner[] getList() {
        return learners;
    }
    public String getListParentsString() {
        String list = "";
        return list;
    }
    public Person[] getListParents() {
        // TODO: 14.01.2021 Сделать список, в котором будут ученики со всеми родителями
        return learners;
    }
}
