package com.zh.flyweight;

/**
 * <p>
 *  外部状态，每个享元对象的外部状态不同
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
