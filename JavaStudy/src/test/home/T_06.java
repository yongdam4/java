package test.home;
import java.util.Scanner;
public class T_06 {
	public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("입력 : ");
	      int num = sc.nextInt();
	      
	      switch(num) {
	      case 1:
	         System.out.println("**입력이 정상적으로 되었습니다!**");
	         break;
	      case 2:
	         System.out.println("**조회가 시작되었습니다!**");
	         break;
	      case 3:
	         System.out.println("**수정이 정상적으로 되었습니다!**");
	         break;
	      case 4:
	         System.out.println("**삭제가 정상적으로 되었습니다!**");
	         break;	      
	      case 5:
	         System.out.println("**정상적으로 종료 되었습니다!**");
	         break;   
	      default :
	            System.out.println("**다시 입력해 주세요!**");
	            
	      }
	      
	      
	      
	      
	   }

}
