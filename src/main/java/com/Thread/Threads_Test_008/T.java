package com.Thread.Threads_Test_008;

import java.util.concurrent.TimeUnit;

/**
 * 一个同步方法可以调用另一个同步方法，一个线程已经拥有了某个对象的锁，再次申请的时候仍然会得到该对象的锁
 * synchronized获得的锁是可以重入的
 * 这的继承中有可能发生情形，子类调用父类的同步请求方法
 * Created by admin on 2019/1/25.
 */
public class T {

    synchronized void  M(){
        System.out.println("M start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("M end");
    }

    public static void main(String[] args) {
            new TT().M();
    }
}

class TT extends T{
    @Override
    synchronized void M(){
        System.out.println("child m start");
        super.M();
        System.out.println("child m end");
    }
}
