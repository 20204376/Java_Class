package exam01;

public class DoWhile {

	public static void main(String[] args) {
// while vs do ~while
//		1) while문
		int num =1;
		while(num<1) {
			System.out.println("while문은"+num+"을 출력하지 못함");
		}
		
//		2) do ~ while
		int num2 = 1;
		
		do {
			System.out.println("do~while문은 적어도 한 번 실행 됨");
		}while(num < 1);
		
	}

}
