package practiceException02;

import java.util.Scanner;

public class NumberMenu {
	
	public void menu() {
		
	
Scanner sc = new Scanner(System.in);


	
		int num1,num2;
		System.out.print("정수1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		num2 = sc.nextInt();
		
		NumberController nc = new NumberController();
		try {
		boolean isDouble = nc.checkDouble(num1, num2);
		
			System.out.print(num1 + "은(는) " + num2 + "의 배수인가 ?" +  isDouble);
	
		}catch(NumRangeException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	
	}
	
}
