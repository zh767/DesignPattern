package com.zh.decorator;

/**
 * <p>
 *   每个单品都有的cost方法 可以抽取出来 也是定义了规范
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
