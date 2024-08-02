package test.home;
import java.util.Scanner;
public class T_07 {
	 public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      
	      int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	      
	      int sum = 0;
	      
	   
	      for(int i = 0; i < 10; i++) {   
	         
	         if(array[i] % 2 ==0) {
	        	 sum += i;
	            continue;
	         }
	         
	         System.out.println(array[i]);   
	         
	      }
	      
	   System.out.println("합계 : "+ (double)sum);
	   
	   
	   
	   
	   }

}
