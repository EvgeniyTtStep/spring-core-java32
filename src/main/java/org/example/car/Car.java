package org.example.car;

import org.springframework.stereotype.Component;

@Component
public interface Car {

    String getName();

    String getColor();

    void info();


}
