package test.home;
import java.util.Scanner;
public class T_04 {
	 public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      
	      int[] arr = new int[2];
	      arr[0] = sc.nextInt();
	      
	      arr[1] = sc.nextInt();
	      
	      System.out.println("합 : " + (arr[0] + arr[1]));
	      System.out.println("차 : " + (arr[0] - arr[1]));
	      System.out.println("곱 : " + (arr[0] * arr[1]));
	      if(arr[1] != 0) {
	      System.out.println("나누기 : " + (arr[0] / arr[1]));
	      }else {
	    	  System.out.println("나누기 : 0");
	      }
	      
	      /*
	      System.out.print("숫자 1 : ");
	      int num1 = sc.nextInt();
	      System.out.print("숫자 2 : ");
	      int num2 = sc.nextInt();
	      
	      if(num2 != 0 && num2 > 0) {
	      System.out.println("합 : " + (int)(num1+num2));
	      System.out.println("차 : " + (int)(num1-num2));
	      System.out.println("곱 : " + (int)(num1*num2));
	      System.out.println("나누기 : " + (int)(num1/num2));
	      }else {
	         System.out.println("합 : " + (int)(num1+num2));
	         System.out.println("차 : " + (int)(num1-num2));
	         System.out.println("곱 : " + (int)(num1*num2));
	         System.out.println("나누기 : 0");
	         
	      }
	      */
	   }

}
