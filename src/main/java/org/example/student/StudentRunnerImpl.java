package org.example.student;

public class StudentRunnerImpl implements StudentRunner {

    private final Student student;

    public StudentRunnerImpl(Student student) {
        this.student = student;
    }


    @Override
    public void runLearning() {
        System.out.println(student.study());
    }
}
