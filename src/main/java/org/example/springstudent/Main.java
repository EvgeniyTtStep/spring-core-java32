package org.example.springstudent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
        StudentRunner studentRunner = (StudentRunnerImpl) context.getBean("studentRunner");
        studentRunner.runLearning();

    }
}
