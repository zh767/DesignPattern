package com.zh.strategy;

public class WildDuck extends Duck {

	@Override
	public void display() {
		System.out.println(" 这是野鸭 ");
	}
	//野鸭 三种动作都可以做 故不用重写父类方法
}
