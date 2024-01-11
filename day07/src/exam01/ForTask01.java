package exam01;

public class ForTask01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 10; i>0; i--) {
			System.out.println(i);
		}
		
		for (int i = 0; i<10; i++) {
			
			System.out.println(i);
		}
		
//	     	실습1
//			이름 10번출력
//			for문 사용
//			1번째 김경윤
//			2번째 김경윤
//			...
//			10번쨰 김경윤
		
//		string name = "김경윤";
			for (int i = 1; i <11; i++) {
				System.out.println(i+"번째 김경윤");
			}
			
			
//			실습2
//			1~10 숫자중 for문 사용
//			짝수만 출력
			
			for(int i =1; i<11; i++) {
				if(i % 2 ==0) {
					System.out.println(i);
				}
			}
			
			for(int i=2; i<11; i+=2) {
				System.out.println(i);
			}
			
			for(int i=1; i<6; i++) {
				System.out.println(i*2);
			}
			
//			구구단 3단
//			3이라는 정수를 저장할 변수 선언
			int dan = 3;
			for(int i=1; i<10; i++) {
//				3 x 1 =3....... 3. x 9 =27
				System.out.println(dan+"x"+i+" = "+(dan*i));
			}

//			for(int i=3; i<10 ; i *=3)
//				System.out.println(i);
			
//			(실습)
//			1~10까지의 숫자 더하기 for문 사용
//			변수명 total : 더한 숫자 저장 int
			
//			총합을 저장할 변수 선언
			int total = 0; 
			
//			for문 : total에 1~10까지 숫자를 차례로 더하기
			for(int i=1; i<11; i++) {
//			total에 i를 더해줘야 함
				total += i; //total = total + i; 
				System.out.println(total);
			}
			반복문을 나오면 total에 1~10까지 다 더해진 상태
			System.out.println("1~10까지의 합:" + total);
			
	}

}
