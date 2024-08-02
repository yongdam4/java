package test.t220240705;
import java.util.Scanner;

public class T_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random()*100) +1;
		//System.out.println(random);
		
		int count = 0;
		
		while(true) {
			System.out.print("1~100사이의 임의의 난수를 맞춰보세요: ");
			 int num = sc.nextInt();
	
	    if(!(num >= 1 && num <=100)) {
	    	System.out.println("1~100사이의 숫자를 입력해주세요.");
	    	continue;
	    	  
	    }
	    count++;
	    if(num == random) {
	    	 
	    	 System.out.println("정답입니다!!");
		    	System.out.println(count + "회만에 맞추셨습니다.");
	    }else if(num > random) {
	    	System.out.println("DOWN !");
	    }else {
	    	System.out.println("UP !");
	    }
	    
	
	
	
	
		}
	
	
	
	
	}
	}
