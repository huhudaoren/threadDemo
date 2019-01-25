package com.Thread.Threads_Test_004;

/**线程重入 问题
 * Created by admin on 2019/1/25.
 */
public class T {

    public int count = 10;

    public /*synchronized*/ void M() {
            count--; //减减
            System.out.println(Thread.currentThread().getName()+"      count = "+count);
    }
    public synchronized void M1() {
        count--; //减减
        System.out.println(Thread.currentThread().getName()+"      count = "+count);
    }

    public static void main(String[] args) {
        //存在问题的线程start
        T t = new T();
        for(int i = 0 ; i < 5; i++){
            new Thread(t::M,"M线程").start();
        }
        //存在问题的线程end （详情看下方详解，运行几次会看到结果）
        T t1 = new T();
        for(int i = 0 ; i < 5; i++){
            new Thread(t1::M1,"M1线程(带线程锁)").start();
        }

    }
    /*
        M线程      count = 7
        M线程      count = 7
        M线程      count = 7
        M线程      count = 6
        M1线程(带线程锁)      count = 9
        M线程      count = 5
        M1线程(带线程锁)      count = 8
        M1线程(带线程锁)      count = 7
        M1线程(带线程锁)      count = 6
        M1线程(带线程锁)      count = 5

        无锁线程：同时出现三个7的问题，在上一个线程还未处理完毕时，后一个线程已经进来了，造成了多次值的改变（线程重入）
        有锁线程：在该锁没有释放之前，后一个线程需要等待该锁的对象到自己的线程中
*/

}
