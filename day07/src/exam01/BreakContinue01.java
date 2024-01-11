package exam01;

public class BreakContinue01 {
	public static void main(String[] args) {

//		1~10중에서 5까지만 출력하고 반복문 종료하기
		
		for(int i=1; i<11; i++) {
			System.out.println(i);
			if(i == 5) {
				break;
			}
		}
		
//		1~10중에서 5만 제외하고 출력하기 ()continue)
		for(int i=1; i<11; i++) {
			if(i==5) {
				continue;
			}//조건문 영역
		    System.out.println(i);
		} //for문 영역
		
		//실습
//		1~20 중에 짝수 제외학 출력(for, continue)
		
		for(int i=1; i<21; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
