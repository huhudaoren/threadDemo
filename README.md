# threadDemo
# 多线程高并发Demo
## 一、 线程启动方式
### 1.1、 com.Thread.Thread_Test_Run包下
罗列三种方式（继承Thread类，实现Runnable接口,匿名内部类），后期补充线程池

## 二、 synchronized关键字（括号代表Package）
### 2.1、 对某个对象加锁（com.Thread.Threads_Test_001）

### 2.2、 对class加锁（com.Thread.Threads_Test_002）

### 2.3、 静态方法被锁，不可以用this问题（com.Thread.Threads_Test_003）

### 2.4、 解决线程重入问题（com.Thread.Threads_Test_004）

### 2.5、 同步和非同步方法同时调用（com.Thread.Threads_Test_005）

### 2.6、 同步和非同步，出现脏读（dirtyRead）问题（com.Thread.Threads_Test_006）

### 2.7、 synchronized获得的锁重入（com.Thread.Threads_Test_007）

### 2.8、 synchronized获得的锁重入、子类调用父类的同步请求方法（com.Thread.Threads_Test_008）

### 2.9、 程序在执行中，出现异常，锁默认会被释放（com.Thread.Threads_Test_009）

## 三、 valatile关键词
