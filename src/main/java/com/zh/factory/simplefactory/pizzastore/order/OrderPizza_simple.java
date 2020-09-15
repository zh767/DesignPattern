package com.zh.factory.simplefactory.pizzastore.order;

import com.zh.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.zh.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.zh.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.zh.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public class OrderPizza_simple {

    private SimpleFactory simpleFactory = null;

    /**
     * 构造器
     *
     * @param simpleFactory
     */
    public OrderPizza_simple(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public void order() {
        //用户输入的
        String orderType = "";
        do {
            orderType = getType();
            Pizza pizza = this.simpleFactory.createPizza(orderType);

            //输出pizza
            if (pizza != null) {
                //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        } while (true);
    }

    /**
     * 写一个方法，可以获取客户希望订购的披萨种类
     */
    private String getType() {
        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strIn.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
