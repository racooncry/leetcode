package main.java.algorithm.basic.spring.ioc.class1;

import main.java.algorithm.basic.spring.ioc.class1.Car;

public class Audi implements Car {
    @Override
    public void start() {
        System.out.println("audi start");
    }

    @Override
    public void turnLeft() {
        System.out.println("audi turnLeft");
    }

    @Override
    public void turnRight() {
        System.out.println("audi turnRight");
    }

    @Override
    public void stop() {
        System.out.println("audi stop");
    }
}
