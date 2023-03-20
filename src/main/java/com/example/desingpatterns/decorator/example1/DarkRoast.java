package com.example.desingpatterns.decorator.example1;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Blend Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
