package com.zh.iterator;

import java.util.Iterator;

/**
 * <p>
 *  对应的计算机的迭代器 可以处理数组结构的遍历
 * </p>
 *
 * @author zh
 * @since 2020/4/30
 */
public class ComputerCollegeIterator implements Iterator<Department> {
    private Department[] departments;
    private int index = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index  >= departments.length || departments[index] == null) {
            return false;
        }
            return true;
    }

    @Override
    public Department next() {
        return departments[index++];
    }

    @Override
    public void remove() {

    }
}
