package com.example.desingpatterns.decorator.example1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Soy extends CondimentDecorator {
    Beverage beverage;

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}