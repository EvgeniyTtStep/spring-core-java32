package org.example.car;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ToyotaCar implements Car {

    private String name;

    private String color;

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private List<String> complectation;

    private Map<String, Integer> gosNumber;

    public Map<String, Integer> getGosNumber() {
        return gosNumber;
    }

    public void setGosNumber(Map<String, Integer> gosNumber) {
        this.gosNumber = gosNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getComplectation() {
        return complectation;
    }

    public void setComplectation(List<String> complectation) {
        this.complectation = complectation;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void info() {
        System.out.println(complectation);
        System.out.println(gosNumber);
    }
}
