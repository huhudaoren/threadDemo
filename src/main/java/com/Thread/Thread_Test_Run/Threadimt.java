package com.Thread.Thread_Test_Run;

/**
 * Created by admin on 2019/1/25.
 */
public class Threadimt implements Runnable{
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Threadexd t = new Threadexd();
        Thread thread = new Thread(t); //通过 Runnable 的实现类，来启动该线程
        thread.start(); //启动线程
    }
}
