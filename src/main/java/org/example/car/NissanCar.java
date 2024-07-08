package org.example.car;


import org.springframework.stereotype.Component;

@Component
public class NissanCar implements Car{

    private String name;

    public NissanCar() {
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return "Nissan color";
    }

    @Override
    public void info() {

    }
}
