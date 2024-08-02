package test.t220240705;
import java.util.Scanner;

public class T_04 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.print("A사원의 연봉 : ");
    double num1 = sc.nextInt();
	System.out.print("B사원의 연봉 : ");
	double num2 = sc.nextInt();
	System.out.print("C사원의 연봉 : ");
	double num3 = sc.nextInt();
	//A, B, C사원의 연봉을 입력하는 참조변수 사용
    
	
	double sum1,sum2,sum3;
	//double값 sum1 sum2 sum3 변수 생성
	
	sum1 =num1+(num1 * 0.4f);
	sum2 = num2; 
	sum3= num3+(num3*0.15f);
	//A사원 B사원 C사원의 각각의 전체 받는 돈 계산
	
	
	System.out.printf("A사원 연봉/연봉+a : %f/%.1f\n",num1, sum1);
	//실수로 연봉/연봉 + a 계산
	System.out.println(sum1 >=3000 ? "3000이상" : "3000미만");
	//삼항 연산자를사용 sum1이 3000보다 >= 크면 3000이상 작으면 미만 적용
	System.out.printf("B사원 연봉/연봉+a : %f/%.1f\n" ,num2, sum2);
	System.out.println(sum2 >=3000 ? "3000이상" : "3000미만");
	System.out.printf("C사원 연봉/연봉+a : %f/%f\n" ,num3, sum3);
	System.out.println(sum3 >=3000 ? "3000이상" : "3000미만");
	
	
	
	
	
	
		
	}
	
}
