package com.javaex.opp.casting;

public class Dog extends Animal {
	// 생성자
	public Dog(String name) {
		super(name);
	}
	
	
	// 메소드
	public void bark() {
		System.out.println(name + " :멍멍!");
	}

}
