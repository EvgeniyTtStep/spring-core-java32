package org.example.car;

import org.springframework.stereotype.Component;

@Component
public class BuyCar{

    private Car car;

    public BuyCar() {
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public  void myCar(){
        System.out.println("My Car: " + "\nname = " + car.getName() + "\ncolor = " + car.getColor());
        car.info();
    }
}
