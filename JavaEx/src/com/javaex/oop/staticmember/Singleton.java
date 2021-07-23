package com.javaex.oop.staticmember;

public class Singleton {
	// static 멤버
	private static Singleton instance = new Singleton();
	

	//생성자
	private Singleton() {
		// 프라이빗) 외부에서 new로 인스턴스 생성 불가
		
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
