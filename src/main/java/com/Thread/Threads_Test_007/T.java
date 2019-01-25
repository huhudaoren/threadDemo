package com.Thread.Threads_Test_007;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * 一个同步方法可以调用另一个同步方法，一个线程已经拥有了某个对象的锁，再次申请的时候仍然会得到该对象的锁
 * synchronized获得的锁是可以重入的
 * Created by admin on 2019/1/25.
 */
public class T {
    synchronized void M (){
        System.out.println("M Start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        M1();
    }
    synchronized void M1(){
        System.out.println("M1 Start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("M1 end");
    }

}


