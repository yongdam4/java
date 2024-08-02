package test.t240704;
import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String role = sc.next();
		String access = "";
		switch(role) {
		case "관리자":
			access += "회원관리 게시글 관리";
		case "회원":
			access += "게시글 작성 댓글 작성";
		case "비회원":
			access += "게시글 조회";
			
			default:
				System.out.println("잘못입력하셨습니다.");
				return;
				
		}
		  
		
		/*
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String role = sc.next();
		if(role.equals("관리자")) {
			System.out.println("회원관리 게시글관리 게시글작성 댓글작성 게시글조회");
			
		}else if(role.equals("회원")) {
			System.out.println("게시글작성 게시글조회 댓글작성");
		}else if(role.equals("비회원")){
			System.out.println("게시글 조회");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		*/
		
		/*
		final String GWUAN = "관리자";
		final String  H = "회원";
		final String B = "비회원";
				
		String name;
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		
		name = sc.next();
		if(GWUAN.equals(name)) {
			System.out.println("회원관리 게시글관리 게시글작성 댓글작성 게시글조회");
			
		}else if(H.equals(name)) {
			System.out.println("게시글작성 게시글조회 댓글작성");
		}else if(B.equals(name)){
			System.out.println("게시글 조회");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		*/
		
	}

}
