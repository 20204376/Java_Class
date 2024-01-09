package exam01;

import java.util.Scanner;

public class Operator08 {

	public static void main(String[] args) {

//		실습
//		다음 중 음식이 아닌 것은?
//		1.피자 2. 케이크 3. 불고기 4. JAVA
//		정답 입력 :
//		정답일 경우-> "정답"
//		오답일 경우 -> "오답"
		
//		변수
//		1)정답을 저장하는 변수 1개
//		2)입력하는 숫자 저장하는 변수 1개
//		삼항연산자로 
		Scanner sc = new Scanner(System.in);
				
	
		System.out.println("다음 중 음식이 아닌 것은?");
		System.out.println("1.pizza");
		System.out.println("2.cake");
		System.out.println("3.firemeat");
		System.out.println("4.Java");
		
//		정답을 저장하는 변수
		final int ANSWER = 4;
		
		//      입력한 숫자 저장한 변수
		System.out.println("정답을 입력하세요 :");
		int choice = sc.nextInt();
		
		//      삼항연산자(조건식?참:거짓)
		String result = ANSWER == choice?"정답":choice >=1 && choice <= 4?"오답":"잘못 입력했습니다";
		System.out.println(result);
		
	}

}
