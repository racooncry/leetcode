package main.java.algorithm.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * @Author yangxw
 * @Date 2019/12/11 9:03
 * @Description
 * @Version 1.0
 */
public class Foo1114 {


}
class Foo {
    private CountDownLatch second=new CountDownLatch(1);
    private CountDownLatch three = new CountDownLatch(1);
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        second.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        second.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        three.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        three.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}



class Foo2 {
    private Semaphore second=new Semaphore(0);
    private Semaphore three = new Semaphore(0);
    public Foo2() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        second.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        second.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        three.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        three.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}