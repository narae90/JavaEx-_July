package com.javaex.oop.summary;

public class SummaryApp {

	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 30);
		Human h2 = new TheOne("네오", 48);
		Panda p1 = new Panda("핑", 30);
		Panda p2 = new KungfuPanda("포", 15);
		
		h1.eat(); // Animal에 있는 
		h1.say(); // Animal에 있는  추상 메소드 -> 자식 클래스에서 override에서 구현
		fight(h1);
		fly(h1);
		
		p1.eat();
		p1.say();
		fight(p1);
		fly(p1);
		
		h2.eat();
		h2.say();
		fight(h2);
		fly(h2);
		
		p2.eat();
		p2.say();
		fight(p2);
		fly(p2);
	}
	
	private static void fly(Animal actor) {
		// actor가 Flyable 인터페이스를 구현?
		if(actor instanceof Flyable) {
			// Flyable로 캐스팅 가능
			((Flyable)actor).fly();
		}else {
			//캐스팅 불가
			System.out.printf("%s: 하늘을 날 수 없어요%n", actor.name);
		}
		
	}
	
	private static void fight(Animal actor) {
		// actor가 KungfuSkill 인터페이스 구현?
		if(actor instanceof KungfuSkill) {
			// 쿵푸스킬로 다운캐스팅 가능
			((KungfuSkill)actor).kungfu();
		}else {
			// 캐스팅 불가
			System.out.printf("%s: 쿨푸 못해요~%n", actor.name);
			
		}
		
	}

}
