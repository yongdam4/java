package d.roof;
import java.util.Scanner;

public class D_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		String str;
		System.out.println("문자열 입력 : ");
		str = sc.next();
		
		int i =0;
		   while(i < str.length()) {
			   if(i % 2 != 0) {
			   System.out.println(str.charAt(i)); //
			   }
			   i++;
		   }
		   */
		/*
		  String str;
		  
			System.out.println("문자열 입력 : ");
			str = sc.next();
		   int i = 1;
		   while(i < str.length()) {
			   System.out.println(str.charAt(i));
			   i += 2;
		   }
		 
		*/
		 		
		
		
		//1부터 랜덤값(1~100사이)까지의 합계를 출력
		//1에서부터 xx까지의 총합계 : xxxx
	
		/*
		int random = (int)(Math.random() * 100) + 1;
		int sum = 0;
		
		int i = 1;
		while(i<=random) {
				sum += i;
			i++;
		}
		System.out.printf("1에서부터" + random + "까지의 총 합계 : " + sum);
		
		*/
		/*
		while(i<num) {
			
			
				if(i % 2 == 0) {
					System.out.print(i+ " ");
				i++;
		}
		*/
		
		/*
		//1에서 부터 10000사이의 홀수만을 출력
		//while문을 이용하여하기
		
		int i = 1;
		while(i < 10001) {
			
			if(i % 2 == 1) {
				
				System.out.println(i + " ");
				
			}
			i++;
			}
		*/
		
		
		/*
		 //사용자가 0을 입력할때 까지 반복해서 숫자를 입력받아 그대로 출력해라
	while(true) {
		int n = sc.nextInt();
		if(n == 0) {
			break;
		}else {
			System.out.println(n);
		}
	}
	*/	
		/*
		
		int i = 0;
		while(i<5) {
			System.out.println("안녕하세요");
			i++;
		}
		*/
		/*
		 * while 문
		 * [표현법]
		 * 
		 * [초기식]
		 * while(조건식){
		 * 반복할 코드
		 * 증감식;
		 * }
		 */
	}
}
