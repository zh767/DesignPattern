package com.zh.factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("北京的奶酪pizza 准备原材料");
	}

}
