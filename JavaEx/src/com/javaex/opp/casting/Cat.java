package com.javaex.opp.casting;

public class Cat extends Animal {
	// 생성자
	public Cat(String name) {
		super(name);
	}
	
	
	// 메소드
	public void meow() {
		System.out.println(name + ": 야옹~");
	}

}
