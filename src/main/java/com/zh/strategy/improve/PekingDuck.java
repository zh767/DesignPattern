package com.zh.strategy.improve;

public class PekingDuck extends Duck {
	public PekingDuck( ) {
		flyBehavior = new BadFlyBehavior();
		quackBehavior = new GagaQuackBehavior();
	}

	@Override
	public void display() {
		System.out.println("~~北京鸭~~~");
	}



}
