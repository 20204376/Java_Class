package method;

public class MethodTask01 {

//	<실습1>
//	더하기, 빼기 , 곱하기 메소드 3개 만들기
	
//	더하기 add : 매개변수 2개, 리턴x
//	빼기 sub : 매개변수 x, 리턴 o
//	곱하기 mul : 매개변수 2개,리턴 o
	
	void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	int sub() {
		int num1 = 10;
		int num2 = 5;
		return num1 - num2;
		
	}
	
	int mul(int num1, int num2) {
		return num1 * num2 ;
	}
	
	
	
	
	
	public static void main(String[] args) {

		
	MethodTask01 test = new MethodTask01();
	
//	1) 더하기(add)
	test.add(10, 30);
		
//	2) 빼기
	System.out.println(test.sub());
		
//	3) 곱하기
	System.out.println(test.mul(2,3));
	
		
	}

}
