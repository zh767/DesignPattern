package com.zh.proxy.staticproxy;

/**
 * <p>
 *  静态代理的优缺点：
 *  优点：代理使客户端不需要知道实现类是什么，怎么做的，而客户端只需知道代理即可（解耦合）
 *  即：在不修改目标对象的功能前提下, 能通过代理对象对目标功能扩展
 *  缺点：
 * 1）代理对象只服务于一种类型的对象，如果要服务多类型的对象。
 * 势必要为每一种对象都进行代理，静态代理在程序规模稍大时就无法胜任了。
 * 我们只为UserManager类的访问提供了代理，但是如果还要为其他类如Department类提供代理的话，
 * 就需要我们再次添加代理Department的代理类。
 * 2）如果接口增加一个方法，除了所有实现类需要实现这个方法外，
 * 所有代理类也需要实现此方法并进行增强代码。增加了代码维护的复杂度。代码冗余，需要大量重复的工作量
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象(被代理对象)
        ITeacherDao teacherDao = new TeacherDao();
        //创建代理对象, 同时将被代理对象传递给代理对象
        TeachDaoProxy teachDaoProxy = new TeachDaoProxy(teacherDao);
        //通过代理对象，调用到被代理对象的方法
        //即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        teachDaoProxy.teach();
    }
}
