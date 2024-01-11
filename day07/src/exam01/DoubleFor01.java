package exam01;

public class DoubleFor01 {

	public static void main(String[] args) {

////		이중 for문
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.println("i ="+i + ", j=" +j);
//			}//안쪽 for문
//		}//바깥 for 문

//		1~100 출력하는
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<10; j++) {
//				System.out.println("i ="+i + ", j=" +j);
//			}
//		}
	
//		실습 1
		for(int dan =2; dan<10; dan++) {
			System.out.println(dan+"단");
			
			for(int i=0; i<10; i++) {
				System.out.println(dan+"x"+i+"="+(dan*i));
			} 
		}
		
		
		
	
	}

}
