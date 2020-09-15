package com.zh.singleton.type4;

/**
 * <p>
 * 双重校验锁实现单例 推荐
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("线程安全的");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1);
        System.out.println(instance2);

    }
}

/**
 * 懒汉式 线程安全 但这种不推荐
 * 第五种 是在判空里面 进行同步 故不能实现同步的效果
 */
class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    /**
     * 提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
     *
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
