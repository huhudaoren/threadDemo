package com.Thread.Thread_Test_Run;

/**   继承Thread类，重写run
 * Created by admin on 2019/1/25.
 */
public class Threadexd extends Thread {
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Threadexd t = new Threadexd();
        t.start();   //启动线程
    }
}
