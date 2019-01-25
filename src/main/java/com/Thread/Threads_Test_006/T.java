package com.Thread.Threads_Test_006;

import java.util.concurrent.TimeUnit;

/**对业务写方法加锁
 * 对业务读方法不加锁
 * 容易产生脏读问题（dirtyRead）
 * Created by admin on 2019/1/25.
 */
public class T {

    String name;
    double balance;
    //对写方法加锁
    public synchronized void  setBalance(String name , double balance){
            this.name = name;
            try{
                Thread.sleep(5000);
                System.out.println("setBalance 时间到");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.balance = balance;
    }
    //对读方法不加锁
    public /*synchronized*/ double getBalance(String name){
        return this.balance;
    }

    public static void main(String[] args) {
        T t = new T();
        new Thread(()->t.setBalance("张三",555.0)).start();

        try{
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t.getBalance("张三"));

        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t.getBalance("张三"));
    }

}
