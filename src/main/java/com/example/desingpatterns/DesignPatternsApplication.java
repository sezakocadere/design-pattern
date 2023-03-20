package com.example.desingpatterns;

import com.example.desingpatterns.decorator.example1.*;
import com.example.desingpatterns.singleton.Singleton;

public class DesignPatternsApplication {
    public static void main(String[] args) {
        System.out.println("(The Decorator Pattern applying)");
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());
        // Order up an espresso, no condiments and print its description and cost

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast); // Wrap it with a Mocha
        darkRoast = new Mocha(darkRoast); // Wrap it in a second Mocha
        darkRoast = new Whip(darkRoast);// Wrap it in a Whip
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend(); // Finally, give us a HouseBlend with Soy, Mocha, and Whip
        houseBlend = new Whip(new Mocha(new Soy(houseBlend)));
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
        System.out.println("__________________________");

        System.out.println("(The Singleton Pattern applying)");
        System.out.println("The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.");

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        singleton.printHashCode();
        singleton1.printHashCode();
        System.out.println("created singleton object hashCode is " + singleton.hashCode());
        System.out.println("created singleton1 object hashCode is " + singleton1.hashCode());
        System.out.println("__________________________");
    }
}
