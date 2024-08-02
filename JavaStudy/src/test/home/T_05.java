package test.home;
import java.util.Scanner;
public class T_05 {
	 public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("입력 : ");
	      int num1 = sc.nextInt();
	      
	      int num2 = sc.nextInt();
	      
	      if(num1 > 0 && num1 < 10 && num2 > 0 && num2 < 10) {
	         int sum = num1 * num2;
	         
	         if(num1 * num2 < 10) {
	            System.out.println("한자리 수 입니다");
	         }else {
	            System.out.println("두자리 수 입니다");
	         }
	      }else {
	         System.out.println("잘못입력하셨습니다.");
	      }
	      //삼항연산자도 사용가능 = > (조건) ? (참일때 나오는 값) : (실패일때 나오는 값)
	      
	   }

}
