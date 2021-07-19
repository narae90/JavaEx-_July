package com.javaex.basics;

public class OperatorEx {
	public static void main (String[] args) {
		arithOperEx();
		logicOperEx();
				
	}
	
	// 비교 연산과 논리연산
	private static void logicOperEx() {
		int a = 7, b = 3;
		
		// 비교 연산자 >, >=, <, <=, ==(같다), !=(같지 않다)\
		System.out.println("a > b ?" + (a > b));
		System.out.println("a와 b가 같습니까?" + (a == b));
		System.out.println("a와 b가 다릅니까?" + (a != b));
		
		// 논리 연산자 : 논리곱 (AND:&&), 논리합(OR:||), 논리부정(NOT : !)
		
		int num = 5;
		
		// num : 0초과 10미만의 값인가?
		// 조건1 : num > 0
		// 조건2 : num < 10
		// 결과 : 조건1 and 조건2
		boolean r1 = num > 0;
		boolean r2 = num < 10;
		boolean r1Andr2 = r1 && r2;
		// num > 0 && num < 10
		System.out.println("r1 && r2 => " + r1Andr2);
		
		// num : 0이하이거나 10이상의 값인가?
		// 조건1 : num <= 0 ?
		// 조건2 : num >= 10 ?
		// 결과 : 조건1 or 조건2 (논리합 : 합집합)
		boolean r3 = num <=0;
		boolean r4 = num >=10;
		boolean r3Orr4 = r3 || r4;
		// num <= 0 || num >= 10
		System.out.println("r3 || r4 =>" + r3Orr4);
		
		// 논리 부정 :
		// num > 0 && num < 10 -> 논리부정
		// num <= 0 || num >= 10
		
		boolean rNot = !(num > 0 && num < 10);
		System.out.println("num가 0 초과, 10미만 이외의 값인가?" + rNot);
		
		
		
		
	}
	
	
	
	
	
	// 산술연산
	private static void arithOperEx() {
		int a = 7, b = 3;
		
		
		// 부호 연산자 : +, -
		System.out.println(-a);
		
		// 사칙연산 : +, -, *, /
		System.out.println(a / b); // int / int => int
		System.out.println(a % b); // 정수 나눗셈의 나머지
		
		// 실제 해 구하기
		System.out.println((float)a / (float)b);
		System.out.println((float)a/ b);
		
		// 증감 연산자 : ++, --
		// 전치 증감(++a 등), 후치 증감(b--) 혼동하지 말자.
		
		// 전치 증감
		int num = 10;
		System.out.println("num:" + num);
		System.out.println("++num:" + ++num);
		System.out.println("num:" + num);
		
		// 후치 증감
		System.out.println("num:" + num);
		System.out.println("num++:" + num++);
		System.out.println("num:" + num);
		
		// 나눗셈 보충
//		System.out.println(4 / 0); // ArithmeticException
		System.out.println(4.0 / 0); // Infinity 무한대
		System.out.println(4.0 / 0 + 10); // Infinity + 10 = Infinity (Infinity 포함된 연산 -> Infinity)
		System.out.println(0.0 / 0.0); // NaN (Not a Number)
		
		// 우리의 연산식 결과가 Infinity인지 확인
		System.out.println(Double.isInfinite(4.0 / 0)); //Infinity 인가?
		System.out.println(Double.isNaN(0.0 / 0.0)); // NaN 인가?
		System.out.println("End of code");
				
		
	}

}
