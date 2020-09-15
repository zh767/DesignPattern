package com.zh.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		//匿名内部类 可以new 接口和抽象类
		AbsAdapter absAdapter = new AbsAdapter() {
			@Override
			public void m5() {
				m1();
			}

			//只需要去覆盖我们 需要使用 接口方法
			@Override
			public void m1() {
				System.out.println("使用了m1的方法");
			}
		};

		absAdapter.m5();
	}
}
