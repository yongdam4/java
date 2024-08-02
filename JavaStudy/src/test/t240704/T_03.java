package test.t240704;
import java.util.Scanner;

public class T_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//코드만 다르고 아래 두개는 결과값이 같다
		/*
		int max, min;
		int num1;
		System.out.println("첫번째 숫자 : ");
		num1 = sc.nextInt();
		
		int num2;
		System.out.print("두번째 숫자 : ");
		num2 = sc.nextInt();
		
		max = (num1 > num2) ? num1 : num2;
		min = (num1 < num2) ? num1 : num2;
		if(min < 1 || max <1) {
			System.out.print("1이상의 숫자를 입력해주세요");
		} else {
		for(int i = min; i <= max; i++) {
			System.out.println(i + " ");
		}
		}
		*/
		/*	
		int num1;
		System.out.println("첫번째 숫자 : ");
		num1 = sc.nextInt();
		
		int num2;
		System.out.println("두번째 숫자 : ");
		num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
		if(num1<num2) {
		for(int i = num1; i <= num2; i++) {	
	    System.out.print(i + " ");	
		}
    }else if(num1>num2) {
    	for(int i = num2; i <= num1; i++) {		
    		System.out.print(i + " ");	
    	}
    }		
}else {
		System.out.println("1이상의 숫자를 입력해주세요");
}
	*/
}
}