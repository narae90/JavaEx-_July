package com.javaex.opp.casting;

public class AnimalApp {

	public static void main(String[] args) {
		// upcasting(promotion)
		Animal dog1 = new Dog("스누피");
		
		dog1.eat();
		dog1.walk();
//		dog1.bark(); // 못함
		// 참조 타입에 설계도에 있는 것만 할 수 있다.
		
		Dog dog2 = new Dog("아지");
		
		dog2.eat();
		dog2.walk();
		dog2.bark(); // 할수 있음
		
		// 다운캐스팅: 명시적으로 변환할 타입을 지정
//		(Dog)dog1
		Dog dog3 = (Dog)dog1;
	
		((Dog)dog1).bark();
		
		Animal pet = new Dog("아지");
		pet.eat();
		pet.walk();
		
//		pet = new Cat("야옹이");
//		pet.eat();
//		pet.walk();
		
		// 다운 캐스팅에는 항상 어떤 클래스의 인스턴스인지 확인! (반드시)
		if (pet instanceof Dog) {
			// Dog로 캐스팅 가능
			((Dog)pet).bark();
		}else if (pet instanceof Cat) {
			// Cat 으로 캐스팅 가능
			((Cat)pet).meow();
		}
		
	}
	
	

}
