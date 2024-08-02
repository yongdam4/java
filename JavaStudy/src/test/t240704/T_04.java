package test.t240704;
import java.util.Scanner;

public class T_04 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int dan;
	System.out.println("숫자 : ");
	dan = sc.nextInt();
	
	if(dan <= 9) {
		
	for(int i = dan; i < 10; i++) {
	System.out.println("====="+ i +"단 ====");
			for(int j = 1; j < 10; j++){
					System.out.println(i + " * "+  j  + "=" + (dan* j));
	}
		}
	
	}else {
			System.out.println("9이상의 수를 입력해주세요.");
		}
	
	
	
	
	
	
	}
}
