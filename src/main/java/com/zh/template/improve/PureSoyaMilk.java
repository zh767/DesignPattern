package com.zh.template.improve;

public class PureSoyaMilk extends SoyaMilk{

	@Override
	void addCondiments() {
		//空实现
	}
	
	@Override
	protected boolean customerWantCondiments() {
		return false;
	}
 
}
