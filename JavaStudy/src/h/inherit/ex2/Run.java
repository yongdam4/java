package h.inherit.ex2;

public class Run {

	/*
	 * 상속
	 * 부모클래스의 필드와 메소드를 자식클래스에서 그대로 이어받아 사용하는것
	 * (실제로 상속된 클ㄹ래스를 통해서 객체 생성시 부모클래스의 객체도 생성이 된다)
	 * 
	 * 상속의 장접
	 * -적은 양의 코드로 새로운 클래스를 정의하고 사용할 수 있다(생산성이 좋음) 
	 * -코드를 공통으로 관리하기 때문에 코드의 추가나 변경이 용이하다(유지보수에 용이)
	 * 
	 * 상속의 특징
	 * -클래스간의 다중상속이 불가(부모는 하나다)
	 * -부모클래스에 정의되어있는 protected 필드는 자식클래스에서 직접접근이 가능하다 (private 가능)
	 * -자식객체는 부모클래스에 있는 메소드를 마치 내것처럼 호출할 수 있다.
	 * +부모클래스의 정의된 기능이 마음에 들지 않는 다면 내 마음대로 수정할 수 있다(오버라이딩)
	 *-명시되어있지는 않지만 모든 클래스(자바에서 제공하는 클래스, 직접만든 클래스) 는 Object 클래스의 후손이다
	 *-> Object 에 있는 메소드를 마음대로 호출해서 사용할 수 있다
	 *-> 오버라이딩도 가능하다
	 */
		public static void main(String[] args) {
			//product클래스를 정의하세요
			//String brean, String pCode, String pName, int price
			
			//product클래스를 상속받는 Desktop객체를 생성
			//boolean allinOne
			
			Desktop d1 = new Desktop("LG", "d-100", "사무용 PC", 10000, true);
			System.out.println(d1.information());
			
			
			//Product를 상속받는 TV클래스 작성
			//필드에는 int inch정보를 가지고 있고 information을 오버라이딩하여 기본 product의 정보 + inch정보 출력
			//tv생성 후 정보출력
			
			Tv tv1 = new Tv("삼성", "T-100", "LED TV", 100000, 55);
			System.out.println(tv1.information());
		}
		
		
	}

