package main.java.algorithm.basic.spring.ioc.class2;

import main.java.algorithm.basic.spring.ioc.class1.Car;

public abstract class HumanWithCar {
    public Car car;

    public HumanWithCar(Car car) {
        this.car = car;
    }


    public abstract void goHome();
}
