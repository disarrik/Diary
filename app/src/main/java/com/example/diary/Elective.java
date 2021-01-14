package com.example.diary;

public class Elective {
    private String academicSubject;
    private Learner[] learners;
    private Teacher classTeacher;

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
