package com.zh.factory.simplefactory.pizzastore.order;

//相当于一个客户端，发出订购
public class PizzaStore {

    public static void main(String[] args) {

        //不使用工厂模式的实现
		/*OrderPizza_normal orderPizza = new OrderPizza_normal();
		orderPizza.order();
		System.out.println("~~退出程序~~");*/

        //使用简单工厂模式
        OrderPizza_simple orderPizza = new OrderPizza_simple(new SimpleFactory());
        orderPizza.order();
        System.out.println("~~退出程序~~");

        //使用简单工厂模式的静态方法
		/*OrderPizza_static orderPizza = new OrderPizza_static();
		orderPizza.order();
		System.out.println("~~退出程序~~");*/
    }

}

