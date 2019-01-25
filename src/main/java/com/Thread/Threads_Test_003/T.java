package com.Thread.Threads_Test_003;

/** synchronized关键词
 *  对某个对象加锁
 * Created by 胡字蒙 on 2019/1/25.
 */
public class T {
    public static int count = 10;
    public  synchronized  static void M1() {  //static  这里等同于synchronized(com.Thread.Threads_Test_003.t.class)
        count--; //减减
        System.out.println(Thread.currentThread().getName()+"      count = "+count);
    }

    public static void mm() {
        synchronized (T.class){//不可以用 this替换T.class , 因为线程是静态对象锁（T.class 可以参考反射）
            count--; //减减
        }
    }
}
