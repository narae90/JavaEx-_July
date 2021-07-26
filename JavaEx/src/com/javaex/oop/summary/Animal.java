package com.javaex.oop.summary;

public abstract class Animal {
	// 필드
	protected String name;  //protected 접근 제한
	protected int age;
	
	// 생성자1
	public Animal(String name) {
		super();
		this.name=name;
	}
	// 생성자
	public Animal(String name, int age) {
		// 자신의 다른 생성자 호출
		this(name); // 생성자1 호출
		this.age=age;
				
	}
	
	// 메소드
	public void eat() {
		System.out.printf("%s is eating...%n", name);
	}
	
	
	// 추상 메소드 : 선언만 한다
	//  자식 클래스에서 Override 해야 한다
	public abstract void say();
	

}
