package com.javaex.basics;

public class OperatorEx {
	public static void main (String[] args) {
		arithOperEx();
				
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
