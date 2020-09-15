package com.zh.factory.absfactory.pizzastore.order;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public class PizzaStore {
    public static void main(String[] args) {
        //创建北京的pizza工厂
        OrderPizza orderPizza = new OrderPizza(new BJFactory());
        orderPizza.order();
    }
}
