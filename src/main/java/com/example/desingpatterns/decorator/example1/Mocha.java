package com.example.desingpatterns.decorator.example1;

public class Mocha extends CondimentDecorator {
    Beverage beverage; // An instance variable to hold the beverage we are wrapping.

    public Mocha(Beverage beverage) {
        this.beverage = beverage; // A way to set this instance variable to the object we are wrapping.
        // Here, we’re going to the beverage we’re wrapping to pass the beverage we're wrapping to the decorator’s constructor.
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
