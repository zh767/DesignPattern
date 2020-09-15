package com.zh.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class College extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        components.remove(component);
    }

    /*@Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }*/

    @Override
    protected void print() {
        System.out.println("============"+getName()+"============");
        //遍历 organizationComponents
        for (OrganizationComponent component : components) {
            component.print();
        }
    }
}
