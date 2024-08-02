package test.t240704;

import java.util.Scanner;

public class T_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		String[] arr = {"일","월","화","수","목","금","토"};
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		
		if(num >= 0 && num < 7) {
			System.out.println(arr[num] + "요일");
		}else {
			System.out.println("잘못입력하셨습니다");
			}
		
		
		
		
		
}
}