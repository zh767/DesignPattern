package com.zh.singleton.type2;

public class SingletonTest02 {

    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

/**
 * 饿汉式(静态代码块)
 */
class Singleton {

    //1. 构造器私有化, 外部不能实例化
    private Singleton() {

    }

    private static final Singleton instance;

    //2.本类静态代码块创建单例对象
    static {
        instance = new Singleton();
    }


    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }

}