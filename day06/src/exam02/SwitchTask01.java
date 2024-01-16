package exam02;

public class SwitchTask01 {

	public static void main(String[] args) {

//		변순 선언
		int num1 = 3;
		
//		switch문
//		num1이 1이면 "num1은 1입니다"
//		num1이 2이면 "num1dms 2입니다"
//		"1도 2도 아니다"
		switch(num1) {
		
		case 1:
			System.out.println("num1은 1입니다");
			break;
		case 2 :
			System.out.println("num1은 2입니다");
			break;
		default :
			System.out.println("1도 2도 아니다");
			
		} //switch 영역
		
			System.out.println("프로그램 종료");	
	}

}
