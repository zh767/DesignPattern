package com.zh.factory.factorymethod.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
	@Override
	public void prepare() {
		System.out.println(" 北京的胡椒pizza 准备原材料");
	}
}
