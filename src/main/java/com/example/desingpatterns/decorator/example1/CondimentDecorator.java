package com.example.desingpatterns.decorator.example1;

public abstract class CondimentDecorator extends Beverage {
    // First, we need to be interchangeable with a Beverage, so we extend the Beverage class
    public abstract String getDescription();
}
