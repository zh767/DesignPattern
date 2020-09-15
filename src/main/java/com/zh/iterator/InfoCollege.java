package com.zh.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/30
 */
public class InfoCollege implements College {
    private List<Department> departments;

    public InfoCollege() {
        //模拟数据
        departments = new ArrayList<>();
        addDepartment("信息安全专业", " 信息安全专业 ");
        addDepartment("网络安全专业", " 网络安全专业 ");
        addDepartment("服务器安全专业", " 服务器安全专业 ");
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments.add(new Department(name, desc));
    }

    /**
     * 我们在选择遍历时 选择迭代器方法帮我们遍历
     * 而各自的迭代器方法传入能处理各自集合的迭代器
     *
     * @return
     */
    @Override
    public Iterator<Department> createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
