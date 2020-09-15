package com.zh.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class ProxyFactory {
    private ITeacherDao target;

    public ProxyFactory(ITeacherDao target) {
        this.target = target;
    }


    public ITeacherDao getProxyInstance() {
        Object desc = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK开始代理 "+method.getName());
                        Object retVal = method.invoke(target, args);
                        System.out.println("JDK代理结束");
                        return retVal;
                    }
                });
        return (ITeacherDao) desc;
    }
}
