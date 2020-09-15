package com.zh.iterator;

import java.util.Iterator;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/30
 */
public interface College {
    public String getName();
    //增加系的方法
    public void addDepartment(String name, String desc);
    //返回相应的迭代器进行遍历
    public Iterator<Department> createIterator();
}
