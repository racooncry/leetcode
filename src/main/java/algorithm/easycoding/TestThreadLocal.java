package algorithm.easycoding;

import java.util.concurrent.TimeUnit;

/**
 * @Author: yxw
 * @Date: 2018/11/2 14:57
 * @Description:
 * @Version 1.0
 */
public class TestThreadLocal {
    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

    public static void main(String args[]) throws InterruptedException {
        Thread threadOne = new ThreadOne(); // 线程1
        Thread threadTo = new ThreadTo(); // 线程2
        threadTo.start(); // 线程2开始执行
        TimeUnit.MILLISECONDS.sleep(100); // 睡眠, 以等待线程2执行完毕
        threadOne.start(); // 线程1开始执行
        TimeUnit.MILLISECONDS.sleep(100); // 睡眠, 以等待线程1执行完毕
        // 此时线程1和线程2都已经设置过值, 此处输出为空, 说明子线程与父线程之间也是互不影响的
        System.out.println("main: " + threadLocal.get());

    }

    /**
     * 线程1
     * @author joonwhee
     * @date 2018年2月24日
     */
    private static class ThreadOne extends Thread {
        @Override
        public void run() {
            // 此时线程2已经调用过set(456), 此处输出为空, 说明线程之间是互不影响的
            System.out.println("ThreadOne: " + threadLocal.get());
            threadLocal.set(123);
            System.out.println("ThreadOne: " + threadLocal.get());
        }
    }

    /**
     * 线程2
     * @author joonwhee
     * @date 2018年2月24日
     */
    private static class ThreadTo extends Thread {
        @Override
        public void run() {
            threadLocal.set(456); // 设置当前ThreadLocal的值为456
            System.out.println("ThreadTo: " + threadLocal.get());
        }
    }


}
