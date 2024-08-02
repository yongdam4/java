package test.t220240705;

import java.util.Scanner;

public class T_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		
	   while(true) {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		System.out.println();
		
		int sum1 = num1 - num2;
		int sum2 = num2 - num1;
		
		int max = (num1>num2) ? num1 : num2;
		int min = (num1<num2) ? num1 : num2;
		
		if(max >= 1 || min >= 1){
		if(num1 > num2) {
		for(int i = 0; i <= sum1; i++) {
			System.out.print(num2 + i + " ");
			break;
		}
		}else if(num1<num2) {
			for(int i = 0; i <= sum2; i++)
			System.out.print(num1 + i + " ");
		}
		break;
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	   }
		
		}
	}
