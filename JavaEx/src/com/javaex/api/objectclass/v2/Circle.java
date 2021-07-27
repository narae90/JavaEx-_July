package com.javaex.api.objectclass.v2;



public class Circle {

	// 필드
	private int x;
	private int y;
	private int radius;
	
	
	// 생성자
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Circle) {
			// 캐스팅 가능
			Circle other = (Circle)obj;
			return  radius == other.radius;
		}
		return super.equals(obj);
	}
	
	
}
