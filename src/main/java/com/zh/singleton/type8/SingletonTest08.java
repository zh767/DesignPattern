package com.zh.singleton.type8;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        instance1.setObjName("firstName");
        System.out.println(instance1.getObjName());
        Singleton instance2 = Singleton.INSTANCE;
        instance2.setObjName("secondName");
        //发现枚举获取和操作的对象是同一个
        System.out.println(instance1 == instance2);
        System.out.println(instance1.getObjName());
        System.out.println(instance2.getObjName());

        // 反射获取实例测试
        try {
            Singleton[] enumConstants = Singleton.class.getEnumConstants();
            for (Singleton enumConstant : enumConstants) {
                System.out.println("反射获取: " + enumConstant.getObjName());
            }
            //就算通过反射暴力获取 也是单例
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * 枚举实现单例  该实现可以防止反射攻击。
 * 在其它实现中，通过 setAccessible() 方法可以将私有构造函数的访问级别设置为 public，
 * 然后调用构造函数从而实例化对象，如果要防止这种攻击，需要在构造函数中添加防止多次实例化的代码。
 * 该实现是由 JVM 保证只会实例化一次，因此不会出现上述的反射攻击。
 */
enum Singleton {
    /**
     * 单例属性
     */
    INSTANCE;
    private String objName;


    public String getObjName() {
        return objName;
    }


    public void setObjName(String objName) {
        this.objName = objName;
    }

}
