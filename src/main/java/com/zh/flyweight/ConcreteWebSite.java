package com.zh.flyweight;

/**
 * <p>
 * 享元对象的实现
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class ConcreteWebSite extends WebSite {
    //内部状态，享元对象共享内部状态 存储在享元对象内部
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public void use(User user) {
        System.out.println(user + "在使用  网站的发布形式: " + type);
    }
}
