package i.polymorphism.ex1;

public class Run {
	public static void main(String[] args) {
		/*
		 *			 클래스 참조변수 = new 클래스 생성자;
	*	   (부모클래스가 올수 있다)  / (자식클래스로 생성할 수 있다.)
	*실제로 어디까지 접근이 가능 / 실제로 어떤 형태의 메모리가 생성이 되는가
		 */
		
		//c1은 new CheeseCake를 대입받아 new CheeseCake공간 메모리 생성
		//생성된 CheeseCake 메모리 안에서 Cake를 사용하려한다
		//Cake가 CheeseCake 속해있으므로 가능
		Cake c1 = new CheeseCake();//가능
		//Cake 까지 접근 가능하며 메모리공간은 실제 CheeseCake다
		c1.sweet();
		c1.yummy();
		
		//c1은 Cake를 대입받아 Cake공간 메모리 생성
		//생성된 Cake 메모리 안에서 CheeseCake를 사용하려한다
		//CheeseCake가 Cake에 속해있을수는 없기때문에 불가능
		//CheeseCake ch2 = new Cake();//불가능
		//실제 메모리 공간이 Cake이므로 CheeseCake 공간에 접근할 수 없다.
		
		
	}
	

}
