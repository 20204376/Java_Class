package exam01;

import java.util.Scanner;

public class WhileTask01 {
	public static void main(String[] args) {

//		while문
//		안녕하세요 10번 출력
//		while(조건식) {}

//		횟수를 count 해줄 변수 선언
		int cnt = 1;
		
		while(cnt <= 10 ) {
			System.out.println("안녕하세요");
			cnt++; //횟수가 1개씩 증가
		}
		
//		무한 반복문
		while (true) {
			System.out.println("ㄳ");
			break; //반복문 안에서 break 반복문 탈출시켜준다.
		}
	
//		while문 무한반복 
//		1~10 숫자를 입력 
//		입력한 숫자가 1 ~ 10 -> 숫자 출력 -> 반복문 탈출(break)
//		아니라면 다시 숫자를 입력
		
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("1~10사이의 숫자 입력 :");
			int num = sc.nextInt();
			
//			조건문 num이 1이상 10 이하
			if(num>=1 && num<=10) {
				System.out.println("입력한 숫자는" + num + "입니다");
				break;
			}else {
				System.out.println("1~10사으 숫자를 입력해주세요");
			}
				
//			<실습>
//			무한반복문
//			정수 1개 입력 받아와서 입력받은 값이 1이면 "반복문 탈출"출력 -> 반복탈출
//			1이 아니면 숫자 다시 입력

			
			while(true) {
				System.out.println("숫자입력:");
				int num2 = sc.nextInt();
			}
			
			if(num2 ==1) {
					System.out.println("반복문 탈출");
					break;
				
				}else {
					System.out.println("다시 입력하세요");
				}
			
			
				
			}
			
			
		
		
	}

}
