package com.zh.factory.factorymethod.pizzastore.order;

import com.zh.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.zh.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.zh.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("北京的奶酪pizza");
        }
        if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
            pizza.setName("北京的胡椒pizza");
        }
        return pizza;
    }
}
