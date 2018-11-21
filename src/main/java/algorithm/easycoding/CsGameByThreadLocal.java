package algorithm.easycoding;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author: yxw
 * @Date: 2018/11/2 14:11
 * @Description:
 * @Version 1.0
 */
public class CsGameByThreadLocal {
    private static final Integer BULLET_NUMBER = 1500;
    private static final Integer KILLED_NUMBER = 0;
    private static final Integer LIFE_NUMBER = 10;
    private static final Integer TOTAL_PLAYERS = 10;

    private static final ThreadLocalRandom RANDOM = ThreadLocalRandom.current();

    // 初始化子弹数
    private static final ThreadLocal<Integer> BULLET_NUMBER_THREADLOCAL = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return BULLET_NUMBER;
        }
    };

    // 初始化杀敌数
    private static final ThreadLocal<Integer> KILLED_ENEMIES_THREADLOCAL = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return KILLED_NUMBER;
        }
    };

    //初始化自己的命数
    private static final ThreadLocal<Integer> LIFE_VALUE_THREADLOCAL = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return LIFE_NUMBER;
        }
    };

    public static void main(String[] args) {
        for(int i=0;i<TOTAL_PLAYERS;i++){
            new Player().start();
        }
    }

    // 定义每位成员
    private static class Player extends Thread{

        @Override
        public void run(){
            Integer bullets=BULLET_NUMBER_THREADLOCAL.get()-
                    RANDOM.nextInt(BULLET_NUMBER);
            Integer killEnmies=KILLED_ENEMIES_THREADLOCAL.get()-
                    RANDOM.nextInt(TOTAL_PLAYERS/2);
            Integer lifeValue=LIFE_VALUE_THREADLOCAL.get()-
                    RANDOM.nextInt(LIFE_NUMBER);
            System.out.println(getName()+",BULLET_NUMBER is"+bullets);
            System.out.println(getName()+",KILLED_ENEMIES is"+killEnmies);
            System.out.println(getName()+",LIFE_VALUE is"+lifeValue);
            BULLET_NUMBER_THREADLOCAL.remove();
            KILLED_ENEMIES_THREADLOCAL.remove();
            LIFE_VALUE_THREADLOCAL.remove();
        }

    }
}
