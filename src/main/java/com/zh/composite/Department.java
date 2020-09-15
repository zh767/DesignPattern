package com.zh.composite;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

 /*   @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }*/

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
