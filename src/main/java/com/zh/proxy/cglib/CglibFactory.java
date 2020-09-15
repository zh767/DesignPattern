package com.zh.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class CglibFactory implements MethodInterceptor {
    private ITeacherDao target;

    public CglibFactory(ITeacherDao teacherDao) {
        this.target = teacherDao;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开始 不需要实现接口 通过继承和字节码实现");
        Object retVal = method.invoke(target, objects);
        System.out.println("cglib代理结束");
        return retVal;
    }

    public ITeacherDao getProxyInstance() {
        return (ITeacherDao) Enhancer.create(target.getClass(), this);
    }

    public ITeacherDao getProxyInstance2() {
        Object desc = Enhancer.create(target.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("cglib代理开始 不需要实现接口 通过继承和字节码实现");
                Object retVal = method.invoke(target, objects);
                System.out.println("cglib代理结束");

                return retVal;
            }
        });
        return (ITeacherDao) desc;
    }
}
