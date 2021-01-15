package com.example.diary;

public class Section {
    private String name;
    private Learner[] learners;
    private Teacher classTeacher;

    Section(String name, Learner[] learners, Teacher classTeacher) {
        this.name = name;
        this.learners = learners;
        this.classTeacher = classTeacher;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public String getListString() {
        // TODO: 15.01.2021 Реализовать функци. отображения списка строкой
        String list = "";
        return list;
    }

    public Learner[] getList() {
        return learners;
    }

    public String getListParentsString() {
        // TODO: 15.01.2021 Реализовать функци. отображения списка строкой 
        String list = "";
        return list;
    }

    public Person[] getListParents() {
        Person[] listWithParents = new Person[learners.length + learners.length * 2];
        int countPerson = 0;
        for (Learner learner: learners) {
            listWithParents[countPerson] = learner;
            countPerson++;
            for (Parent parent: learner.parents) {
                listWithParents[countPerson] = parent;
                countPerson++;
            }
        }
        Person[] result = new Person[countPerson];
        for (int i=0; i < countPerson; i++) {
            result[i] = listWithParents[i];
        }
        return result;
    }
}
