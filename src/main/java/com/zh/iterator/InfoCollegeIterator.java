package com.zh.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * <p>
 * 对应的信息学院的迭代器 可以处理链表结构的遍历
 * </p>
 *
 * @author zh
 * @since 2020/4/30
 */
public class InfoCollegeIterator implements Iterator<Department> {
    private List<Department> departments;
    private int index = 0;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;

    }


    @Override
    public boolean hasNext() {
        if (index >= departments.size() || departments.get(index) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Department next() {
        return departments.get(index++);
    }

    @Override
    public void remove() {

    }
}
