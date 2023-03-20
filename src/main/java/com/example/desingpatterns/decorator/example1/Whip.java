package com.example.desingpatterns.decorator.example1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Whip extends CondimentDecorator {
    Beverage beverage;
    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
