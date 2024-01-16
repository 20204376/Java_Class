package method;

public class MethodTask02 {

//	1) 매개변수 x, 리턴 x
	void printHello() {
		System.out.println("안녕");
	}
	
//	2)매개변수 x, 리턴 o
	int add() {
		int num1 = 1; //지역변수
		return num1 + 10;
	}
	
//	3) 매개변수 o, 리턴 x
	void add2(int num1, int num2) {
		System.out.println(num1 + num2);
	}
		
//	4) 매개변수 o, 리턴 o
	int add3(int num1, int num2) {
		return num1 + num2;
	}
		
		
		
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodTask02 test = new MethodTask02();
		
//		1) 매개변수 x, 리턴 x
		test.printHello();
		
//		2) 매개변수 x, 리턴 o
		System.out.println(test.add());		
//		3) 매개변수 x, 리턴 o
		test.add2(20, 30);
		
//		4) 매개변수 o, 리턴 o
		System.out.println(test.add3(100, 200));
		
	}

}
