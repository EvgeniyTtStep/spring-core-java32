package org.example.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuyCar{

    @Autowired
    private Car car;

    public BuyCar() {
    }

    public Car getCar() {
        return car;
    }

    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    public  void myCar(){
        System.out.println("My Car: " + "\nname = " + car.getName() + "\ncolor = " + car.getColor());
        car.info();
    }
}
