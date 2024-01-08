package exam02;

public class OPerator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	단항연산자
//	1) 부호연산자 : +, -
	int num1 = 10;
	int num2 = 20;
	
	System.out.println(-num1);
	System.out.println(+num2);
	
//	증감연산자 : ++, --
	num1 ++; // num = num+1
	System.out.println("++연산 결과 : " + num1); // 10+1
		
	num2--; //num2 -1
	System.out.println("--연산 결과:" + num2);
		
//	전위형 : 해당 라인부터 바로 적용
	int num3 = 1;
	System.out.println("전위형:" + --num3);
	
//	후위형 : 다음 라인부터 적용
	int num4 = 1;
	System.out.println("후위형: "+ num4--);
	System.out.println("후위형 다음 라인:" + num4);
	
	int x =1;
	int result = x-- + 5 + --x;
	System.out.println("연산결과:" + result);
//	x-- + 5 : --후위형으로 x + 5가 먼저 연산 되고 --
//	--x는 전위형이므로 바로 적용 -> x-1 = 0
//	감소 연산이 수행된 후에 덧셈 연산이 수행 됨 -> 5 + 0 ->5
//	마지막에 대입 연산이 실행됨 result = 5

//  !(NOT) 연산자 : !ture -> false, !false -> true
	System.out.println(!true);
	System.out.println(!false);
	
		
	}

}
