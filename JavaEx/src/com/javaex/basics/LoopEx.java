package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
//		dowhileEx();
//		forGugu();
//		continueEx();
//		whileGuguPractice();
//		forGuguPractice();
//		whileStarPractice();
//		forStarPractice();
		breakEx();
		
		System.out.println("End of Code");

	}
	
	
	private static void breakEx() {
		int num =1;
		
		while(true) { //무한 루프
			if (num % 6 == 0 && num % 14 ==0)
				break; //루프 탈출
			num++;
		}
		System.out.println(num);
		
	}		
	private static void forStarPractice() {
			//	행루프
			for (int row = 1; row <= 6; row++) {
				for (int col = 1; col <= row; col ++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
	private static void whileStarPractice() {
			int row = 1;
			//	행 루프
			while(row <= 6) {
				//	열 루프
				int col = 1;
				while (col <= row) {
					System.out.print("*");
					col++;
				}
				System.out.println(); //	한 행 끝난 후 개행
				row++;
			}
		}	
		
	
	private static void forGuguPractice() {
		// 단루프
		for (int dan =2; dan <=9; dan++) {
			//숫자 루프
			for(int num =1; num <=9; num++) {
				System.out.println(dan + "*" + num + "=" + (dan *num));
			}
		}
	}
	
	
	private static void whileGuguPractice() {
		int dan = 2; //단루프
		while(dan <=9 ) {
			//숫자 루프
			int num = 1;
			// 숫자 루프
			while(num <=9) {
				System.out.println(dan + "*" + num + "="+(dan*num));
				num++;
						
			
		}
			dan++;
			
		}
		
	}
		

	
	private static void continueEx() {
		for(int i= 1; i <= 20; i++) {
			if(i % 2 == 0 || i % 3 == 0)
				continue;
			System.out.println(i);
		}
		
	}
	
	private static void forGugu() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("단을 입력하세요.");
		int dan = scanner.nextInt();
		
		for(int i = 1; // 초기화 
			i <=9; //반복 조건 
			i++) { //증감식	
			System.out.println(dan + "*" + i + "=" + (dan*i));
		} 

		scanner.close();
	}
	
	
	private static void dowhileEx() {
		// 적어도 한번은 수행되어야 하는 반복,
		// 반복 조건이 반복문 내부에서 할당되는 경우
		int total = 0, value = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("숫자를 입력하세요. [0이면 종료]");
			value =scanner.nextInt();
			total += value; // total = total + value
		} while(value != 0);
		
		System.out.println("합계 :" + total);
		scanner.close();
		
	}
	
	private static void whileGugu() {
		Scanner scanner = new Scanner(System.in);
		int dan;
		int i = 1; // 반복 제어 변수
		
		System.out.println("단을 입력하세요.");
		System.out.println("단:");
		dan = scanner.nextInt();
		
		while(i <= 9) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
			i++;
		}
		scanner.close();
	}

	
	
	
	
	private static void whileEx() {
		int num = 0; // 반복 조건 제어 변수
		
		while(num <= 9) {
			System.out.println("I Like Java" + num);
			num++; // 주의 : 무한 반복에 빠지지 않도록 적절히 제어
		}
	}

}


