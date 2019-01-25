package com.Thread.Threads_Test_009;

/**
 * 程序在执行中，如果出现异常，默认情况锁会被释放
 * 在并发处理的过程中，有异常要小心，不然可能会发生不一致的情况
 * 比如一个web app处理过程中，多个servlet线程共同访问一个资源，这时如果异常处理不合适
 * 在第一个线程中抛出异常，其他线程就会进入同步代码区，有可能会访问到异常时的数据
 * 因此要小心的处理同步业务逻辑中的异常
 * Created by admin on 2019/1/25.
 */
public class T {

    int count = 0;
    synchronized void M(){
        System.out.println(Thread.currentThread().getName()+"M start");
        while (true){
            count++;
            System.out.println(Thread.currentThread().getName() + "count = " +count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (count == 5 ){
                int i = 1 / 0;  //此处抛出异常，锁被释放，要想不被释放，可以在这里进行catch，再让循环继续
            }
        }
    }

    public static void main(String[] args) {
            T t  = new T();
            new Thread(()->t.M(),"M").start();

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Thread(()->t.M(),"M_Excep").start();

    }
}
