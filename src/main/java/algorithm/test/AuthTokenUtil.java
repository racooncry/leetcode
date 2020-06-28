package algorithm.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/18 19:56
 * @Version: 1.0
 */
public class AuthTokenUtil {
    private static SnowflakeIdWorker snowflakeIdWorker=new SnowflakeIdWorker(1,1);


    public static void main(String[] args) {
        int n=5000;
        ExecutorService executorService= Executors.newFixedThreadPool(n);
        for(int i=0;i<n;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println( snowflakeIdWorker.nextId());
                }
            });
        }
        executorService.shutdown();


    }

}
