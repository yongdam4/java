package test.t240704;

import java.util.Scanner;

public class T_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		String str1;
		System.out.print("문자열 : ");
		str1 = sc.next();
		
		System.out.println("문자 : ");
		char ch = sc.next().charAt(0);
		
		char[] chArr = new char[str1.length()];
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = str1.charAt(i);
		}
		
		System.out.println(str1 + "에 " + ch + "가 존재하는 위치(인텍스) : " );
		
		int count = 0;
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println(ch + "개수 : " + count);
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}