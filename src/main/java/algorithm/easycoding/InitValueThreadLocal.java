package algorithm.easycoding;

import org.omg.CORBA.TIMEOUT;

import java.util.concurrent.TimeUnit;

/**
 * @Author: yxw
 * @Date: 2018/11/2 14:27
 * @Description:
 * @Version 1.0
 */
public class InitValueThreadLocal {

    private static final StringBuilder INIT_VALUE = new StringBuilder("init");

    private static final ThreadLocal<StringBuilder> bulder = new ThreadLocal<StringBuilder>() {
        @Override
        protected StringBuilder initialValue() {
            return INIT_VALUE;
        }
    };

    private static class AppendStringThread extends Thread {
        @Override
        public void run() {
            StringBuilder inThread = bulder.get();
            for (int i = 0; i < 10; i++) {
                inThread.append("-" + i);
            }
            System.out.println(inThread.toString());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++){
            new AppendStringThread().start();
        }
        TimeUnit.SECONDS.sleep(10);
    }

}
