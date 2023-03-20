package com.example.desingpatterns.singleton;

public class Singleton {
    // The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it
    private static Singleton uniqueInstance; // We have a static variable to hold our one instance of the class Singleton

    private Singleton() {
    } // Our constructor is declared private; only Singleton can instantiate this class!

    public static Singleton getInstance() {
        // Lazy Initialization
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here..
    public void printHashCode() {
        System.out.println(uniqueInstance.hashCode());
    }
}
