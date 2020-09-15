package com.zh.factory.simplefactory.pizzastore.order;

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

public class OrderPizza_static {

    public void order() {
        String orderType = ""; //用户输入的
        do {
            orderType = getType();
            Pizza pizza = SimpleFactory.createPizza2(orderType);

            //输出pizza
            if (pizza != null) { //订购成功
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
