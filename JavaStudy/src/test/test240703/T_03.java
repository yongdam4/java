package test.test240703;
import java.util.Scanner;

public class T_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int koscore = sc.nextInt();
		System.out.print("수학점수 : ");
		int mathscore = sc.nextInt();
		System.out.print("영어점수 : ");
		int enscore = sc.nextInt();
		
		System.out.println("국어 : " + koscore);
		System.out.println("수학 : " + mathscore);
		System.out.println("영어 : " + enscore);
		
		int sum1 = (koscore + mathscore + enscore);
		System.out.println("합계 : " + sum1);
		//정수 연산일 경우 결과는 정수가 된다(int)
		//둘 중 하나를 실수로 변경해주면 연산시 자동형변환에 의해서 실수값의 결과가 나온다
		
		double sum2 = ((double)sum1 / 3);
		System.out.printf("평균 : %.1f" , sum2);
		
		if(koscore >= 40 && mathscore >= 40 && enscore >= 40 && sum2 >= 60 ) {
				System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		
		
}
}