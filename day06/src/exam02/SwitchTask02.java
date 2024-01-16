package exam02;

import java.util.Scanner;

public class SwitchTask02 {

	public static void main(String[] args) {
		
//		음식 메뉴 출력 프로그램
//		사용자로부터 1~3까지의 숫자를 입력받고
//		1 : 햄버거
//		2 : 피자
//		3 : 치킨
//		그외 : 1~3사이의 숫자를 입력해주세요 출력
//		000을 주문00하셨습니다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요:"); 
		int num1 = sc.nextInt();
		String menu ; //전역변수
		
		switch(num1) {
		case 1:
			menu = "햄버거";
			System.out.print(menu+"를 주문하셨씁니다");
			break;
		case 2:
			menu = "피자";
			System.out.print(menu+"를 주문하셨습니다");
			break;
		case 3:
			menu = "치킨";
			System.out.print(menu + "을 주문하셨습니다");
			break;
		default:
			System.out.println("1~3사이의 숫자를 입력해주세요");
	
		}
		
		System.out.print( "을 주문하셨습니다");
	
	
	}

}
