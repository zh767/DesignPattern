package com.zh.singleton.type3;

/**
 * <p>
 * 双重校验锁实现单例 推荐
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("线程不安全的");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1);
        System.out.println(instance2);

    }
}

/**
 * 懒汉式 线程不安全
 */
class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    /**
     * 提供一个静态的公有方法，当使用到该方法时，才去创建 instance
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
