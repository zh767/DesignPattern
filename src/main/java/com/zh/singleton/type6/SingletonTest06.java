package com.zh.singleton.type6;

/**
 * <p>
 * 双重校验锁实现单例 推荐
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重校验锁");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1);
        System.out.println(instance2);
    }
}

class Singleton {
    private Singleton() {
    }

    /**
     * 加volatile是防止创建对象时 指令重排序
     * 创建对象是三步  1、分配内存空间
     *               2、执行构造方法，初始化对象
     *               3、把这个对象指向这个空间
     *       如果发生指令重排序 造成步骤132 而在没有初始化完成时
     *       instance已经不是null 其他线程判非空返回一个未初始化完成的对象是错误的
     */
    private static volatile Singleton instance;

    /**
     * 不加第一个if  会使得效率低 因为不为null可以直接返回 而不是要取到锁才往下走
     * 不加第二个if  会破坏单例 因为两个线程同时判空进来
     * 一个阻塞在同步代码块外 而等另一个线程创建对象释放锁后 阻塞的线程会再创建一个对象
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
