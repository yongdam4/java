package test.test240703;
import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.println("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("입력메뉴입니다.");
			break;
		case 2:
			System.out.println("수정메뉴입니다.");
			break;
		case 3:
			System.out.println("조회메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
			default:
				System.out.println("입력 오류입니다.");
			break;
			
			
			
			
		}
	}
}
