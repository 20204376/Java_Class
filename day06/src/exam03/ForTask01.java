package exam03;

public class ForTask01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for문
//		0~9까지 출력
//		for(초기식; 조건식; 증감식) {}
		for(int i=0; i<10; i++) {
//			1)초기식에 i = 0 대입
//			2) 조건식 i<10 -> true, false
//			3) 조건식이 true라면 반복문 영역 실행문 실행
//			4) 실행이 끝나며 증감식 부분으로 가서 변수 증감
//			5) 조선식으로 다시 가서 ture, false 판별
			System.out.println("안녕하세요");
		}
		
		for(int i=10; i>0; i-- ) {
			System.out.println(i);
		}
		
	}

}
