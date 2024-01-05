package exam02;

public class DataType03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ga1 = '가';
		char na1 = '나';
		char a1 = 'a';
		char b1 = 'b';
	
		System.out.println(ga1);
		System.out.println(na1);
		System.out.println(a1);
		System.out.println(b1);
		
//		문자형을 정수형(int)에 저장한 경우
//		char형은 문자가 아니라 유니코드라는 숫자로 저장
		int ga2 = '가';
		int na2 = '나';
		int a2 = 'A';
		int b2 = 'B';
		
		System.out.println(ga2);
		System.out.println(na2);
		System.out.println(a2);
		System.out.println(b2);
	}

}
