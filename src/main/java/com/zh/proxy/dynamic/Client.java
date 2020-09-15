package com.zh.proxy.dynamic;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new TeacherDao());
        ITeacherDao proxyInstance = proxyFactory.getProxyInstance();
       // proxyInstance.teach();
        System.out.println(proxyInstance.use("123"));
        System.out.println(proxyInstance.getClass());
    }
}
