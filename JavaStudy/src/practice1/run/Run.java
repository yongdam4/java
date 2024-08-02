package practice1.run;

public class Run {

	public static void main(String[] args) {
		Member yongdam = new Member();
		yongdam.changeName("김용담");
		yongdam.printName();
		
		
		//아이디, 비번 , 이름을 초기화하는 생성자를 통해
		//객체를 하나 생성하고 printName()을 통해 이름을 출력하시오
		
		Member suckyean = new Member("su1206", "su12", "조석현");
		suckyean.printName();
		
	}
	
	
}
