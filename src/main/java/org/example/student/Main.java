package org.example.student;

public class Main {
    public static void main(String[] args) {

//        Student student = new ItstepStudent();
//        Student student1 = new DNUStudent();
//        StudentRunner studentRunner = new StudentRunnerImpl(student1);
//        studentRunner.runLearning();

        InitStudent.initStudent();
        StudentRunner studentRunner = InitStudent.initStudentRunner();
        studentRunner.runLearning();



    }
}
