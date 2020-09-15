package com.zh.proxy.cglib;

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

}
