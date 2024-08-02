package test.home;

import java.util.Scanner;

public class T_01 {
	public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	     
	      System.out.print("입력 : ");
	      int num = sc.nextInt();
	      
	      if(num % 2 == 0) {
	         System.out.println("2의 배수입니다");
	      }else if(num % 2 != 0) {
	         System.out.println("2의 배수가 아닙니다.");
	      }
	      }
	      
	   
}
