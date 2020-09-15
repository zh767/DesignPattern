package com.zh.proxy.staticproxy;

/**
 * <p>
 * 代理对象 静态代理
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class TeachDaoProxy implements ITeacherDao {
    private ITeacherDao target;//通过接口聚合

    public TeachDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理");
        target.teach();
        System.out.println("代理结束");
    }
}
