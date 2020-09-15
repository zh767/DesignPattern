package com.zh.proxy.cglib;

/**
 * <p>
 * CGLib动态代理是代理类去继承目标类，然后重写其中目标类的方法啊，这样也可以保证代理类拥有目标类的同名方法
 * 代理类去继承目标类，每次调用代理类的方法都会被方法拦截器拦截，在拦截器中才是调用目标类的该方法的逻辑
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class Client {
    public static void main(String[] args) {

        //创建目标对象
        ITeacherDao teacherDao = new TeacherDao();

        //获取到代理对象，并且将目标对象传递给代理对象
        CglibFactory cglibFactory = new CglibFactory(teacherDao);
        ITeacherDao proxyInstance = cglibFactory.getProxyInstance();

        //执行代理对象的方法，触发 intercept 方法，从而实现 对目标对象的调用
        proxyInstance.teach();
    }
}
