# threadDemo
# 多线程高并发Demo
## 一、 线程启动方式
### 1.1、 com.Thread.Thread_Test_Run包下
罗列三种方式（继承Thread类，实现Runnable接口,匿名内部类），后期补充线程池

## 二、 synchronized关键字
### 2.1、 com.Thread.Threads_Test_001包下
对某个对象加锁
### 2.2、 com.Thread.Threads_Test_002包下
对class加锁
### 2.3、 com.Thread.Threads_Test_003包下
静态方法被锁，不可以用this问题
### 2.4、 com.Thread.Threads_Test_004包下
解决线程重入问题
### 2.5、 com.Thread.Threads_Test_005包下
同步和非同步方法同时调用
### 2.6、 com.Thread.Threads_Test_006包下
同步和非同步，容易出现脏读问题（dirtyRead）
### 2.7、 com.Thread.Threads_Test_007包下
synchronized获得的锁是可重入
### 2.8、 com.Thread.Threads_Test_008包下
synchronized 获得的锁重入、子类调用父类的同步请求方法
### 2.9、 com.Thread.Threads_Test_009包下
程序在执行中，出现异常，锁默认会被释放

## 三、 valatile关键词
