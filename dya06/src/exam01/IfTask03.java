package exam01;

import java.util.Scanner;

public class IfTask03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		실습
//		1. 홀 짝 판별(if문)
//		사용자로부터 하나의 정수를 입력 받아 입력 받은 정수가 홀짝 판별
//		짝수라면 "짝수" 출력
//		홀수라면 "홀수" 입력
		
//		Scanner 클래스 호출
//		홀수, 짝수 -> %연산자 이용	짝수 % 2 ==0, 홀수 % 2 ==1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력:");
		
		int myOdd = sc.nextInt();
		
//		System.out.println(my Odd % 2 ===0?"짝수":"홀수");
		
		if (myOdd % 2 ==0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
				
			}
		
		
	}

}
