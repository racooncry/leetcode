package main.java.algorithm.basic.spring.ioc.class2;

import main.java.algorithm.basic.spring.ioc.class1.Car;

public class ZhangSan extends HumanWithCar {
    public ZhangSan(Car car) {
        super(car);
    }

    @Override
    public void goHome() {
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
}
