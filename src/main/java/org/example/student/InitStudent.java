package org.example.student;

public class InitStudent {


    private static Student student;
    private static StudentRunner studentRunner;

    public static void initStudent(){
        student = new DNUStudent();
    }

    public static StudentRunner initStudentRunner(){
        return studentRunner = new StudentRunnerImpl(student);
    }

}
