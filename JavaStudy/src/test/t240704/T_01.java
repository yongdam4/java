package test.t240704;
import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final String ID = "myId";
		final String PWD = "myPassword12";
		String id;
		String pwd;
		
		System.out.println("아이디 : ");
		id = sc.next();
		
		System.out.println("비밀번호 : ");
		pwd = sc.next();
		
		//아이디 비밀번호 모두 일치
		//아이디만 일치
		//패스워드만 일치
		if(ID.equals(id)) {//아이디 일치
			if(PWD.equals(pwd)) {//비밀번호 불일치
			System.out.println("로그인성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {//아이디 불일치
			System.out.println("아이디가 틀렸습니다.");
		}
		
		
		
		
		
		
	}

}
