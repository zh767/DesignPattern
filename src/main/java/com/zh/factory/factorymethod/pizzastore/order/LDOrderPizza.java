package com.zh.factory.factorymethod.pizzastore.order;

import com.zh.factory.factorymethod.pizzastore.pizza.*;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("伦敦的奶酪pizza");
        }
        if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
            pizza.setName("伦敦的胡椒pizza");
        }
        return pizza;
    }
}
