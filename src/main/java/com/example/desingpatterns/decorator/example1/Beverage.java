package com.example.desingpatterns.decorator.example1;

import lombok.Getter;

@Getter
public abstract class Beverage {
    String description = "Unknown Beverage";

    public abstract double cost();
}
