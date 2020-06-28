package main.java.algorithm.thread;

import java.util.concurrent.Semaphore;

/**
 * @Author yangxw
 * @Date 2019/12/12 9:22
 * @Description
 * @Version 1.0
 */
public class FooBar1115 {


    private int n;

    public FooBar1115(int n) {
        this.n = n;
    }
    private final Semaphore semaphoreFoo=new Semaphore(0);
    private final Semaphore semaphoreBar=new Semaphore(1);

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphoreBar.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            semaphoreFoo.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphoreFoo.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            semaphoreBar.release();
        }
    }
}
