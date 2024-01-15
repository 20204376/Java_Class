package exam01;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {

//		배열의 선언
//		1) 배열의 어떤 값을 넣을지 알 때 선언 방법
//		자료형[] 배열명 = {값1, 값2, 값3,.....};
		int[] arr1 = {1, 2, 3, 4, 5}; //정수형 배열 arr1 선언;
		
		
//		2)몇 개의 값이 들어올지 알지만 정확히 값을 모를 때 선언 방법
		int[] arr2 = new int[5]; //5개의 정수형 데이터가 들어 올 배열
		
//		3) 어떤 값을 넣을지도 모르고 몇 칸을 만들지도 모를 때
		int[] arr3 = null;
		
//		배열명 그대로 출력
		System.out.println(arr1);
//		배열의 길이(배열 안의 칸수)		
		System.out.println(arr1.length);
//		배열의 인덱스 번호
		System.out.println("arr1의 첫번째 값:" + arr1[0]);
		System.out.println("arr1의 두번째 값:" + arr1[1]);
		System.out.println("arr1의 세번째 값:" + arr1[2]);
		System.out.println("arr1의 네번째 값:" + arr1[3]);
		System.out.println("arr1의 다섯번째 값:" + arr1[4]);
		
//		반복문 사용 배열 요소 확인(for문)
		for(int i = 0; i< arr1.length; i++) {
			System.out.println("arr1의" +(i+1)+"번째 값:" +arr1[i]);
		}
		
//		arr2 반복문으로 칸 개수만 정해준 배열 출력
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr2[i]);
		}

//		<실습>
//		arr2의 값을 넣기
//		for문 사용해서 index 번호로 배열 요소 불러오기
//		숫자를 입력해서 배열에 숫자 다섯개 넣기
//		배열 요소 수정: 배열명[index] = 값;
		
		Scanner sc = new Scanner(System.in);
		
//		반복문으로 배열요소에 차례로 입력한 값 대입
		for(int i =0; i<arr2.length; i++) {
			System.out.println((i+1)+"번째 숫자입력 :" );
			arr2[i] = sc.nextInt();
		}
		
//	    반복문으로 배열요소 값 수정되었는지 확인
		for(int i=0; i<arr2.length; i++) {
			System.out.println((i+1) + "번째 값 =" + arr2[i]);
		}
			System.out.println("arr2에 넣을 숫자를 입력하세요:" );
			
			
	}

}
