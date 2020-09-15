package com.zh.proxy.dynamic;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师在教课");
    }

    @Override
    public String use(String a) {
        System.out.println("use 方法调用"+a);
        return a+"255";

    }
}
