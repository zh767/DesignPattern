package com.zh.factory.simplefactory.pizzastore.pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 给"+name+"准备原材料 ");
    }
}
