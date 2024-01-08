package day04;

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
//	입력 메소드
//	1) scanner 클래스
//		ctrl + shift + o -> 자동 import
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요:");
		String str = sc.next();
		String str2 = sc.next();
		System.out.println(str+"님 안녕하세요");
		System.out.println(str2+"님 안녕히 가세요");
		
		
		
		
		
	}

}
