package test.t220240705;
import java.util.Scanner;

public class T_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		double num1 = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double num2 = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double num3 = sc.nextDouble();
		System.out.print("출석 회수 : ");
		double num4 = sc.nextDouble();
		//여러 성적들 입력 칸 입력
		
		System.out.println("=============결과=============");
	
		double sum1, sum2, sum3, sum4, total;
		
		sum1 = num1 * 20 / 100;
		sum2 = num2 * 30 / 100;
		sum3 = num3 * 30 / 100;
		sum4 = num4 ;
		total = (sum1+sum2+sum3+sum4);
		
		System.out.println("중간 고사 점수(20) : " + sum1);
		System.out.println("기말 고사 점수(30) : " + sum2);
		System.out.println("과제 점수        (30) : " + sum3);
		System.out.println("출석 점수        (20) : " + sum4);
		System.out.println("총점 : " + total);
		if(20*30/100 < sum4) {
			System.out.println(total < 70 ? "Fail[점수미달]" : "Pass[합격]");
		
		}else{
			System.out.println("Fail[장기 미출석]");	
		}
	
	
	}
	}
