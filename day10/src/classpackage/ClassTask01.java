package classpackage;

// Animal class
// 필드 : 이름name 나이age 종spe
// 생성자 1개 : 이름, 나이, 종
// 메소드명 introduce() : 이름, 나이 , 종 출력

 
class Animal {
//	필드 
	String name;
	int age;
	String spe;
	
//	생성자
	public Animal(String name, int age, String spe ) {
		this.name =  name;
		this.age = age;
		this.spe = spe;
		
	}
	
//	introduce() 메소드
	void introduce() {
		System.out.println("이름:바둑이");
		System.out.println("나이:27");
		System.out.println("종:개");
	}

	
	
	
}




public class ClassTask01 {

	public static void main(String[] args) {
		// 2개 객체 생성
		// dog 객체 생성, cat 객체
		// 객체마다 메소드(introduce()) 호출

//		animal 클래스의 인스턴스(객체) dog 생성 : 이름, 나이, 종 초기화
		Animal dog  = new Animal("바둑이",27,"개") ;
		Animal cat  = new Animal("장기",26,"고양이") ;
		
//		Animal  클래스 안에 있는 메소드 호출
		
		dog.introduce();
		cat.introduce();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
