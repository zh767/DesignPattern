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

public class OrderPizza_normal {
    /**
     * 可以看出我们不用工厂模式 如果要新增pizza种类 就要修改使用方 违背了迪米特原则
     * 如果新增多个pizza子类 而且有多个 orderPizza orderPizza都要修改 拓展性差
     * 使用工厂模式 使用方通过工厂获得pizza 新增pizza种类只需修改工厂中生产pizza的代码
     */
    public void order() {
        Pizza pizza = null;
        String orderType; // 订购披萨的类型
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName(" 希腊披萨 ");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName(" 奶酪披萨 ");
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            } else {
                break;
            }
            //输出pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
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
