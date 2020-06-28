package main.java.algorithm.basic.spring.ioc.class1;

public class Zhangsan {
    private Car car;

    public Zhangsan(Car car){
        this.car=car;
    }
    public void goHome(){
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }

    public void goShop(){
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }

}
