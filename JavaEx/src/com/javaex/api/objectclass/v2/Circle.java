package com.javaex.api.objectclass.v2;



public class Circle {

	// 필드
	private int x;
	private int y;
	private int z;
	
	public Circle(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		// 객체 출력 포맷을 리턴
		return String.format("Circle(%d, %d, %d)" , x, y,z);
	}
	@Override
	public boolean equals(Object obj) {
		// 전달받은 obj가 point 클래스의 객체?
		if(obj instanceof Circle) {
			// 캐스팅 가능
			Circle other = (Circle)obj;
			return  z == other.z;
		}
		return super.equals(obj);
	}
	
	
}
