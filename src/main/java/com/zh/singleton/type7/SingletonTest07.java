package com.zh.singleton.type7;


/**
 * <p>
 * 静态内部类实现单例
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("静态内部类");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1);
        System.out.println(instance2);
    }
}

/**
 * 推荐使用
 * 1 当外部类装载时 静态内部类不会装载 在第一次调用静态内部类进行装载
 * 2 静态内部类装载过程中线程安全且只会装载一次
 *
 * 当Singleton类被加载时,静态内部类 SingletonHolder 没有被加载进内存。
 * 只有当调用 getUniqueInstance() 方法从而触发 SingletonHolder.INSTANCE 时
 * SingletonHolder 才会被加载，此时初始化 INSTANCE 实例，
 * 并且 JVM 能确保 INSTANCE 只被实例化一次。
 * 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
 */
class Singleton {

    /**
     * 第一步一定是构造器私有
     */
    private Singleton() {
    }

    /**
     * 写一个静态内部类,该类中有一个静态属性 Singleton
     */
    private static class SingletonHolder  {
        public static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
     *
     * @return
     */
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
