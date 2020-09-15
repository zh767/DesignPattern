package com.zh.factory.absfactory.pizzastore.order;

import com.zh.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.zh.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.zh.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("北京的奶酪pizza");
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
            pizza.setName("北京的胡椒pizza");
        }
        return pizza;
    }
}
