package com.javaex.basics;

// 변수, 예제
// 데이터 타입 예제
public class Types {
	static final int SPEED_LIMIT = 120; 
	public static void main(String[] args) {
//		varEx();
//		integerEx();
//		floatDoubleEx();
//		booleanEx();
//		charEx();	
//		constantEx();
//		promotionEx();
		castingEx();
		
	}
	
	// 명시적 형변환(casting : explicit casting)
	private static void castingEx() {
		// 표현 범위가 넓은 자료형 -> 좁은 자료형으로 변환
		// 강제로 타입 변환을 수행해야, 자료의 유실이 일어날 수 있다.
		
		float f = 1234567890.123456789F; // 4바이트 실수형 (정밀도 떨어짐)
		System.out.println(f);
		
		long l = (long)f; //오류가 남 -> 내가 책임지겠단 의미로 (long) 입력  -> 8바이트 정수형 -> 소숫점 자료의 유실 발생
		System.out.println(l);
		
		int i = (int)l; // 4바이트정수형
		System.out.println(Integer.toBinaryString(i));
		
		short s = (short)i; // 2바이트 정수형
		System.out.println(Integer.toBinaryString(s));		
		
		
	}
	
	// 암묵적 형변환(promotion : implicit casting)
	private static void promotionEx() {
		// byte < short < int < long < | float < double
		// 표현 범위 좁은 자료형 - > 넓은 자료형으로
		// 자동 변환 수행
		byte b = 25; // 1바이트 정수형
		System.out.println(b);

		short s = b; // 2바이트 정수형
		System.out.println(s);
		
		int i = s;  // 4바이트 정수형
		System.out.println(i);
		
		long l = i; // 8바이트 정수형
		System.out.println(l);
		
		float f = l; // 4바이트 실수형
		// 바이트 수는 적지만, 표현 범위가 더 넓다.
		System.out.println(f);
		
		double d = f; // 8바이트 실수형
		System.out.println(d);
		
		
		
	}
	
	// 상수
	private static void constantEx() {
//		final int SPEED_LIMIT = 120; // 코드의 가독성과 코드의 변경이 용이해진다 - 맨 첫줄에 적용하기
		
		System.out.println("제한속도:"+ SPEED_LIMIT);		
		System.out.println("현재 도로의 제한 속도는" + SPEED_LIMIT + "입니다."); 
		
//		SPEED_LIMIT = 160; // 변경 시도 -> final 적용하면 변경 시도 불가
		
//		System.out.println("제한속도:"+ SPEED_LIMIT);		
//		System.out.println("현재 도로의 제한 속도는" + SPEED_LIMIT + "입니다.");  // 이런 경우를 막기 위해 final 사용 
		
	}
	
	
	//문자형 데이터 타입
	private static void charEx() {
		// 부호가 없는 정수 코드
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(ch1 + ch2); 
		
		String str = "A한";
		System.out.println(str);
		
	}
	
	// 논리형 데이터 타입
	private static void booleanEx() {
		// 1byte : true or false
		// 조건 분기, 반복문 등에 활용 -> 중요함
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		// 비교 연산, 논리 연산의 결과로 활용
		
		int a = 7, b =3;
		boolean result = a > b;
		
		System.out.println(result);
		
		
	}
	
	//실수형 데이터 타입
	private static void floatDoubleEx() {
		// float(4) < double(8)
		float floatVar = 3.14159F; // F or f  
		double doubleVar = 3.14159;
		
		System.out.println(floatVar);
		System.out.println(doubleVar);
		
		
		// 지수 표기법
		doubleVar = 3E10; // 3*10^10 (10의 10승)
		floatVar = 3e-6f; // 3*10^-6
		
		System.out.println(doubleVar);
		System.out.println(floatVar);
		
		
		// 부동소수점 계산의 문제
		// float, double은 정밀도를 포기하고 표현 범위 넓힌 것
		// 정밀 실수 처리에는 적합하지 않다.
		
		System.out.println(0.1*3);
		
		
	}
	//정수형 데이터 타입
	private static void integerEx( ) {
		// byte(1) < short(2) < int(4) < long(8)
		int intVar1, intVar2; //선언
		
		intVar1 = 2021; //초기화
		//intVar2 = 1234567890123; // out of range : 저장범위 초과
		System.out.println(Integer.toBinaryString(intVar1));
		
		long longVar1, longVar2;
		
		longVar1=2021;
		longVar2=1234567890123L; // 끝에 L or l 
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		// 2진수, 8진수, 16진수
		int bin, oct, hex;
		
		bin = 0b1101; // 2진수 0b -> 13 : 10진수
		oct = 072; // 8진수 0 -> 58 : 10진수
		hex = 0xFF; //16진수 0x
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
	}
	
	
	
	
	
	// 변수의 선언과 사용 
	private static void varEx() {
		/*변수의 식별자 규칙 
		 * 1. 문자, 숫자, $, _ 사용할수 있다.
		 * 2. 숫자로 시작할수 없다.
		 * 3. 예약어는 사용할 수 없다.
		 * 4. 변수, 메소드의 명명규칙 : camelCase
		 */
		
		//int age; //선언
		//age = 32; //초기화
		int age=32; //선언+초기화 
		
		//자바는 정적 타입 언어로, 다른 타입의 데이터를 담을 수 없다.
		// age=3.14; -> Error
		
		//조회
		System.out.println("나이는"+age);
		
		//한번에 여러 변수를 선언할 때	
		int v1 = 10, v2 = 20, v3 = 30; //같은 정수라서 가능
		
		//여러 변수의 동일한 값을 할당
		v1 = v2 = v3 = 40;
		
		
	}
	
	

}
