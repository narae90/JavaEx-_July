package com.javaex.api.objectclass.v2;

public class Rectangle {

	private int width;
	private int height;

	
	public Rectangle( int width, int height) {
		this.width =width;
		this.height=height;
		
	}


	@Override
	public String toString() {
		// 객체 출력 포맷을 리턴
		return String.format("Rectangle(%d, %d)" , width*height);
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			// 캐스팅 가능
			Rectangle other = (Rectangle)obj;
			return  width == other.width ;
		}
		
		return super.equals(obj);
	}
	
}