package snackex00;
import java.util.Scanner;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	public void menu() {
		String kind;
		String name;
		String flavor;
		int numOf;
		 int price;
		
		 System.out.println("스낵류를 입력하세요.");
		 
		 System.out.print("종류 : ");
		 kind = sc.next();
		 System.out.print("이름 : ");
		 name = sc.next();
		 System.out.print("맛 : ");
		 flavor = sc.next();
		 System.out.print("갯수 : ");
		 numOf = sc.nextInt();
		 System.out.print("가격 : ");
		 price = sc.nextInt();
		 
		scr.saveData(kind, name, flavor, numOf, price);
		//(1번)
		//res = scr.saveData(kind, name, flavor, numOf, price);
		//scr.saveData(kind, name, flavor, numOf, price)를 res
		//에 대입
		//(2번)
		//System.out.println(res);
		//res값 출력
		
		
		
		System.out.println("저장한 정보를 확인하시겠습니까?(y/n) : ");
		char ch = sc.next().charAt(0);
		//답은 비슷하지만 다름 //잘못한것 번호순으로 나타내줌
		
		//( 3번)
		//if(ch == 'y'){ //내가 입력한 값이 y라면
		//
		//res = scr.comfirmData();    
		//comfirmDate()를 res에 대입 
		//
		//(6번)
		//System.out.println(res) // res출력
		//}
		
		
		
		
		
		System.out.println( (kind + "(" + name + "-" + flavor + ")" + numOf + "개" + price + "원"));
	
	
}
	
}
