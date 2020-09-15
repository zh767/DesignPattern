package com.zh.factory.factorymethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza{
	@Override
	public void prepare() {
		System.out.println(" 伦敦的胡椒pizza 准备原材料");
	}
}
