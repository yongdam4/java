package test.home;
import java.util.Scanner;
public class T_03 {
	public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      
	      int sum = 0;
	      int i = 1;
	      
	      while(i <= 100) {
	         sum += i;
	         i++;
	      }
	      int sum1 = 0;
	      sum1 = sum/100;
	      System.out.println("합계 : " + (double)sum);
	      System.out.println("합계 : " + (double)sum1);
	   }
}
