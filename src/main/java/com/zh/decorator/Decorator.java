package com.zh.decorator;

/**
 * <p>
 *      装饰者模式 核心类Decorator
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {//组合了已有的被装饰类
        this.obj = obj;
    }

    @Override
    public float cost() {
        //super.getPrice() 自己价格  obj.cost表示现有的总价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes() 输出被装饰者的信息
        return super.getDes() + obj.getDes();
    }
}
