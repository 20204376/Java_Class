package exam01;

import java.util.Scanner;

public class IfTest04 {

	public static void main(String[] args) {

//		실습2
//		성적 부여 프로그램
//		사용자 점수(정수)를 입력받고
//		90점 이상 -> 당신의 학점 : A
//		90점 이상 -> 90미만 -> B
//		70 이상 80미만 -> C
//		60 이상 70미만 -> D
//		60 미만 -> F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요:");
		int myScore = sc.nextInt();
		
//		학점을 저장하는 변수(선언만)
		String grade;
		
		if(score >=90) {
			grade = "A";
		}else if(score >=80) {
			grade = "B";
		}else if(score >=70) {
			grade ="c";
		}else if(score >=60) {
			grade ="D";
		}else {
			grade ="F";
		}
		System.out.println("당신의 학점:" + grade);
		
//		if (myScore >=90) {
//			System.out.println("A");
//		}else if (myScore >= 80) {
//			System.out.println("B");
//		
//		}else if(myScore >=70){
//			System.out.println("C");
//		
//		
//		}else if(myScore >=60){
//			System.out.println("D");
//		
//		
//		}else {
//			System.out.println("F");
//		}
		 
		
		
		
		
		
		
		
	}

}
