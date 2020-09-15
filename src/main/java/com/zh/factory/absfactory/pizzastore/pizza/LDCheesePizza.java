package com.zh.factory.absfactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println(" 伦敦的奶酪pizza 准备原材料");
	}
}
