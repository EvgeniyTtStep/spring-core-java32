package org.example.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("car.xml");
//        BuyCar buyCar = (BuyCar) context.getBean("buyCar");
//        buyCar.myCar();



        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        BuyCar buyCar = (BuyCar) context.getBean("buyCar");
        buyCar.myCar();


    }
}
