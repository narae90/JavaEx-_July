package com.javaex.oop.point.v4;

// 상속: extends
public class ColorPoint extends Point{
	// 추가 필드
	private String color;
	
	// 생성자
	public ColorPoint(int x, int y, String color) {
		// 명시적으로 부모 생성자 선택
		super(x, y);
		this.color=color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// 메소드 오버라이드
	@Override
	public void draw() { // 물려 받았으나 자신만의 새로운 기능 덮어쓰기
		// 방법1. 부모의 getter, setter를 이용
//		System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다. %n",
//				super.getX(),
//				super.getY(),
//				color);
		// 방법2. 부모의 필드를 protected로 변경
		System.out.printf("색깔점[c=%d, y=%d, color=%s]을 그렸습니다. %n",
				x,y, color);
		
	}
	
	// TODO: Point 클래스 draw(boolean) 메소드를 오버라이드 해보기

}
