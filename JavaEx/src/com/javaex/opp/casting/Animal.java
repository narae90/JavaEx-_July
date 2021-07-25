package com.javaex.opp.casting;

public class Animal {
	// 필드 생성
	protected String name;
		
	// 생성자
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	// 메소드
	public void eat() {
		System.out.println(name + "is eating...");
	}
	
	public void walk() {
		System.out.println(name + "is walking...");
	}

}
