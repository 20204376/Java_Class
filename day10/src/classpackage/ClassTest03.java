package classpackage;

class Phone {

// 필드
	String brand;
	String series;
	String color;
	
// 생성자 단축키 : alt+ shift + s, o
// 매개변수 3개 있는 생성자
	public Phone(String brand, String series, String color) {
		this(brand, series); //this() 자기 생성자를 가져온다
//		this.brand = brand;
//		this.series = series;
		this.color = color; // 매개변수 3개 있는 생성자에 추가된 내용
		
		
		
	}

//	매개변수 2개 있는 생성자
	public Phone(String brand, String series) {
		this.brand = brand;
		this.series = series;
	}
	
	// 생성자 단축키 :
	
	void printPhone() {
		System.out.println("브랜드명 :" +brand);
		System.out.println("시리즈명"+series);
		System.out.println("색상"+color);
		
	}



	

}

public class ClassTest03 {

	public static void main(String[] args) {

//		객체생성 (생성자 매개변수 3개)
		Phone p1 = new Phone("아이폰","15 pro", "white");
		Phone p2 = new Phone("갤럭시", "S22");
		p2.color = "black" ;
		
		p1.printPhone();
		p2.printPhone();
		
		
		
		
		
		
		
		
		
		
	}

}
