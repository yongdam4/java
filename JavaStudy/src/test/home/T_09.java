package test.home;
import java.util.Scanner;
public class T_09 {
	 public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	     
	      int[][] array = {{12, 41, 36, 56},{82, 10, 12, 61},{14, 16, 18, 78},{45, 26, 72, 24}};
	  
	      int max = array[0][0];
	      int min = array[0][0]; 
	      
	      for(int i = 0; i < array.length; i++) {
	    	  for(int j = 0; j < array[i].length; j++) {
	    		
	    		  max = (max < array[i][j]) ? array[i][j] : max;
	    		 min = min > array[i][j] ? array[i][j] : min; 
	    		  //및의 if문과 같다
	    		  
	    		  /*
	    		  if( array[i][j] > max ) {
	    			 max = array[i][j];
	    		 }
	    		 if(  array[i][j] < min  ) {
	 	    			min = array[i][j];
	    		 }
	    		 */
	    	 }
	    }
	      System.out.println("최대값 : " + max);
	      System.out.println("최소값 : " + min);    
	 }
	     
	 }
