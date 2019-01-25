package com.Thread.Threads_Test_001;

/**
 * synchronized 关键字
 * 对某个对象加锁
 *
 * Created by 胡字蒙 on 2019/1/24.
 */
public class T{

    public int count = 10;
    public Object o = new Object();

    public  void M() { //任何代码要执行下面代码，必须先拿到    o   的锁
        synchronized (o){
            count--; //减减
            System.out.println(Thread.currentThread().getName()+"count = "+count);
        }
    }

    public static void main(String[] args) {
        T t = new T();
        new Thread(t::M,"Test").start();
    }
}
