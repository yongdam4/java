package a.basic;
import java.util.Scanner;

public class Practice2 {
	/*
	 * 키도브로 가로, 세로 값을 실수 형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요
	 * 면적 : 가로 * 세로
	 * 둘레 : (가로+세로)*2
	 * 
	 * 가로 : (키보드로 입력)
	 * 세로 : (키보드로 입력)
	 * +소수점 2번째 자리까지만 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
			float	width, height;
		System.out.println("가로 : ");
		width = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("세로 : ");
		height = sc.nextFloat();
		sc.nextLine();
		
		System.out.printf("면적 : %.2f\n", (width * height));
		System.out.printf("둘레 : %.2f\n", (width + height)*2);
		  
		
	}
}
