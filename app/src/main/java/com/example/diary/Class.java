package com.example.diary;

public class Class {
    private String number;
    private Teacher classTeacher;
    private Learner[] learners;

    Class(String number, Teacher classTeacher, Learner[] learners) {
        this.number = number;
        this.classTeacher = classTeacher;
        this.learners = learners;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public String getListString() {
        String result = "";
        for (Learner learner: learners) {
            result += learner.getFullName() + '\n';
        }
        return result;
    }

    public Learner[] getList() {
        return learners;
    }

    public String getListParentsString() {
        String result = "";
        for (Learner learner: learners) {
            result += learner.getFullName() + '\n';
            for (Parent parent: learner.getParents()) {
                result += parent.getFullName() + '\n';
            }
        }
        return result;
    }

    public void addLearner(Learner newLearner) {
        Learner[] bufer = learners;
        int leng = learners.length + 1;
        learners = new Learner[leng + 1];
        for (int i = 0; i < learners.length - 1; i++) {
            learners[i] = bufer[i];
        }
        learners[learners.length - 1] = newLearner;
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
