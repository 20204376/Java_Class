package exam01;

public class IfTest02 {

	public static void main(String[] args) {
		int myAge = 20;
		
//		if문을 여러개 작성 했을 시 else if문과 다르게 동시에 참거짓인지 판별
		
		if(myAge >= 20) {
			System.out.println("20살 이상입니다");
		}if(myAge >= 17) {
			System.out.println("고등학생입니다");
		}
	}

}
