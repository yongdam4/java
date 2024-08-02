package PracticeException;
import java.util.Scanner;

public class CharacterMenu{

	Scanner sc = new Scanner(System.in);
	CharacterController cc = new CharacterController();
	public void menu() {
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		try {
		int length = cc.countAlpha(str);
		System.out.println("\'" + str +  "\'" + "에 포함된 영문자 갯수 : "  + length);
		}catch(CharCheckException e) {
			System.out.println("문자열에 공백이 포함되어있습니다.");
			e.printStackTrace();
		}finally {
			sc.close();
			System.out.println("잘 종료되었습니다.");
		}
		
		
		
	}

}
