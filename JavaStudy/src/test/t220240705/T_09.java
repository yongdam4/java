package test.t220240705;
import java.util.Scanner;

public class T_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("시스템 종료.");
			break;
		}
		else if(num >= 1 ) {
		for( int i =1; i <= num; i++) {
			
			if(i % 2 == 1) {
				System.out.print("박");
				
			}else {
				System.out.print("수");
			}
			
		}
			}else {
			System.out.println("양수가 아닙니다.");
		}
		
		}
	
	
	
	
	
	
	
	
	
	
	}
	}
