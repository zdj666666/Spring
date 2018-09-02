package com.zdj.create;

public class StaticFactory {
		
	public static StaticFactory getStaticInstance() {
		
		System.out.println("这里是通过创建了一个静态工场，返回一个对象");
		return new StaticFactory();
	}
	
	
}
