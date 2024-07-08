package org.example.car;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@ComponentScan("org.example.car")
public class JavaConfig {


    @Bean
    public Car toyotaCar() {
        ToyotaCar toyotaCar = new ToyotaCar();
        toyotaCar.setName("ToyotaCar");
        toyotaCar.setColor("red");
        toyotaCar.setComplectation(Arrays.asList("Condition", "Cruis", "Automat"));
        Map<String, Integer> map = new HashMap<>();
        map.put("AP", 2222);
        map.put("AB", 1111);
        toyotaCar.setGosNumber(map);
        return toyotaCar;
    }

    @Bean
    public Car nissanCar() {
        NissanCar nissanCar = new NissanCar();
        nissanCar.setName("NissanCar");
        return nissanCar;
    }
//    @Bean
//    public BuyCar buyCar(@Qualifier("toyotaCar") Car car) {
//        BuyCar buyCar = new BuyCar();
//        buyCar.setCar(car);
//        return buyCar;
//    }


    @Bean
    public BuyCar buyCar(@Qualifier("nissanCar") Car car) {
        BuyCar buyCar = new BuyCar();
        buyCar.setCar(car);
        return buyCar;
    }
}
