package com.javaex.api.objectclass.v2;

/**
 * @author Administrator
 *
 */
public class Rectangle {
	// 필드
	private int width;
	private int height;

	// 생성자 (초기화 작업)
	public Rectangle( int width, int height) {
		this.width =width;
		this.height=height;
		
	}


	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			// 캐스팅 가능 = (강제캐스팅)
			Rectangle other = (Rectangle)obj;
			return  width * width == other.height;
		}
		
		return super.equals(obj);
	}
	
}