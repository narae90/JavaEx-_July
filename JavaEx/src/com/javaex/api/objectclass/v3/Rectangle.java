package com.javaex.api.objectclass.v3;

/**
 * @author Administrator
 *
 */
public class Rectangle implements Cloneable {
	// 필드
	int width;
	int height;

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
	
	// 복제 객체를 생성하는 메소드 
	public Rectangle getClone() {
		Rectangle clone = null;
		
		try {
			clone = (Rectangle)clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
}