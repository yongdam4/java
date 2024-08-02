package test.home;
import java.util.Scanner;
public class T_02 {
	
	 public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      
	      int sum = 0;
	      
	      for(int i = 2; i <= 5; i++) {
	         for(int j = 1; j <= 9; j++) {
	            sum = i * j;
	            if(sum % 2 != 0) {
	            System.out.printf("%d * %d = %d\n", i, j, sum);
	            }
	         }
	      }
	   }
}
