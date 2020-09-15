package com.zh.factory.factorymethod.pizzastore.order;

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
        //北京的pizza
        /*OrderPizza bjOrderPizza = new BJOrderPizza();
        bjOrderPizza.order();*/
        //伦敦的pizza
        OrderPizza ldOrderPizza = new LDOrderPizza();
        ldOrderPizza.order();
    }
}
