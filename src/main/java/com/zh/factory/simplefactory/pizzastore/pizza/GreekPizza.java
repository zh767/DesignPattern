package com.zh.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println(" 给"+name+"准备原材料 ");
	}

}
