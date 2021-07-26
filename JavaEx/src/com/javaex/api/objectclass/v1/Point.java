package com.javaex.api.objectclass.v1;

// v1. 모든 크래스의 최상의 부모는 object이다
// 		toString: 객체를 문자열로 출력할 때 홀출되는 메소드
// public class point extends java.lang.object
public class Point {
	//필드
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		// 객체 출력 포맥을 리턴
		return String.format("Point(%d, %d)", x, y);
	}

}
