package com.zh.composite;

/**
 * <p>
 *  就是抽象的Component
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public abstract class OrganizationComponent {
    private String name; //名称
    private String des; //说明

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    protected abstract void print();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
