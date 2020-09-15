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
public class ComputerCollege implements College {
    private Department[] departments;
    private int index = 0;//当前未赋值的索引

    public ComputerCollege() {
        //模拟数据
        departments = new Department[5];
        addDepartment("Java专业", " Java专业 ");
        addDepartment("PHP专业", " PHP专业 ");
        addDepartment("大数据专业", " 大数据专业 ");
        addDepartment("PHP专业", " PHP专业 ");
        addDepartment("大数据专业", " 大数据专业 ");
        addDepartment("大数据专业", " 大数据专业 ");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        if (index <= departments.length - 1) {
            departments[index] = new Department(name, desc);
            index++;
        }
    }

    /**
     * 我们在选择遍历时 选择迭代器方法帮我们遍历
     * 而各自的迭代器方法传入能处理各自集合的迭代器
     * concrete 意为具体的
     * @return
     */
    @Override
    public Iterator<Department> createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
