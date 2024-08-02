package k.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Runexception {

	public void method01() {
Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("a/b....a : ");
		int n1 = sc.nextInt();
		
		System.out.print("a/b....b : ");
		int n2 = sc.nextInt();
		
		System.out.printf("%d / %d = %d \n ", n1, n2, n1/n2);
		System.out.println("트라이 종료");
	}catch(Exception e) {
		e.printStackTrace();
	}
		
		
//		catch(ArithmeticException e) {
//		System.out.println("수학적 에러 발생");
//	}catch(InputMismatchException e) {
//		System.out.println("입력오류");
//	}
		System.out.println("good bye~~");
}
	public void method02() {
		/*
		 * CheckedException : 반드시 예외처리를 해야되는 예외들
		 * => 조건문을 미리 제시할 수 없음(왜? 예측이 불가한 곳에서 문제가 발생하기 때문에 예외처리가 필수)
		 * => 외부 매개체와 입출력이 일어날 때 발생한다.
		 * 
		 */
		//Scanner 와 같이 키보드로 값을 입력받을 수 있는 객체 (단, 문자열로 읽어들인다)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = null;
		//1. try~ catch문 : 여기서 곧바로 예외를 처리하겠다
		try {
			str = br.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		//2. throws : 여기서 예외를 처리하지 않고 현재 이 메소드를 호출한 곳으로 예외처리를 떠넘기겠다.
		System.out.println("입력" + str);
	}

 public void methodA() throws IOException{
	methodB();
 }	
 public void methodB() throws IOException{
	methodC();
 }
 public void methodC() throws IOException {
	throw new IOException();
 }
		

}
