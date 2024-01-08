package day04;

import java.util.Scanner;

public class InpputTask04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	실습		
//	이름(String), 나이(int)를 입력받아서 출력
		
//	이름:(이름입력)
//	나이:(나이입력)
//	000님 안녕하세요
//	000님의 나이는 00살입니다
//	000님 안녕히 가세요
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("이름 입력:");
				String name = sc.nextLine();
		   
		System.out.print("나이:");
				int age = sc.nextInt();
				
		System.out.println(name+"님 안녕하세요");
		System.out.println(name+"님의 나이는" + age + "살입니다");
		System.out.println(name+"님 안녕히가세요");
	
	
	
	}

}
