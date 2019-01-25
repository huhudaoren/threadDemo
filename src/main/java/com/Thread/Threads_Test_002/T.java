package com.Thread.Threads_Test_002;

/**
 * synchronized 关键字
 * 对class加锁
 *
 * Created by 胡字蒙 on 2019/1/24.
 */
public class T{

    public int count = 10;

    public  void M() { //任何代码要执行下面代码，必须先拿到   class  的锁
        synchronized (this){
            count--; //减减
            System.out.println(Thread.currentThread().getName()+"      count = "+count);
        }
    }
    public  synchronized void M1() { //等同于 M 方法
            count--; //减减
            System.out.println(Thread.currentThread().getName()+"      count = "+count);
    }
    public static void main(String[] args) {
        T t = new T();
        new Thread(t::M,"M下的线程").start();
        new Thread(t::M1,"M1下的线程").start();

    }
}
