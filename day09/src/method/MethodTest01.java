package method;
public class MethodTest01 {
	
//	두개의 정수를 합하는 메소드
//	리턴타입 메소드명 매개변수
	int add(int num1, int num2 ) {
//		실행할 기능
		int result = num1 + num2; //지역변수
		return result;
	}
	
	public static void main(String[] args) {
		
		
	MethodTest01 task = new MethodTest01();
	
//	System.out.println(method.add(10, 20));
		
	int result = task.add(10,20);
	System.out.println(result);
		
	System.out.println(task.add(10,20)+2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
