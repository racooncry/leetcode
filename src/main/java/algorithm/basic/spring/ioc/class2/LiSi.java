package main.java.algorithm.basic.spring.ioc.class2;

import main.java.algorithm.basic.spring.ioc.class1.Car;

public class LiSi extends HumanWithCar {
    public LiSi(Car car) {
        super(car);
    }

    @Override
    public void goHome() {
        car.start();
        car.stop();
    }
}
