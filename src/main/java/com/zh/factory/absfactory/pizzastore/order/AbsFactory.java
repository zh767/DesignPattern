package com.zh.factory.absfactory.pizzastore.order;

import com.zh.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * <p>
 *一个抽象工厂模式的抽象层接口
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public interface AbsFactory {
    //定义方法 让下面的具体子类工厂具体实现
    Pizza createPizza(String orderType);
}
