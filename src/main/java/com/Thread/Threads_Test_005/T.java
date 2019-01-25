package com.Thread.Threads_Test_005;

/**     同步和非同步方法可以同时调用
 * Created by admin on 2019/1/25.
 */
public class T {

    public synchronized void M(){
        System.out.println("M(同步方法) Start");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("M(同步方法) end");
    }
    private void M1(){
        System.out.println("M1(非同步方法) Start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("M1(非同步方法) end");
    }

    public static void main(String[] args) {
        T t = new T();
        new Thread(t::M,"M线程").start();
        new Thread(t::M1,"M1线程").start();
    }

}
