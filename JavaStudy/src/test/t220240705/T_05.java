package test.t220240705;
import java.util.Scanner;

public class T_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 : ");
		double cm= sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg= sc.nextDouble();
		//몸무게와 키를 입력할수있게 만들어주는 참조변수 생성
		
		double bmij = kg / (cm * cm);
		//bmi지수 계산
		System.out.println("BMI 지수 : " + bmij);
		//콘솔창에 bmi지수 나타냄
		
		double BMI = bmij;
		//double 형 BMI 생성 하는 동시에 bmi 지수 계산값 대입
		
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		}else if(BMI >= 18.5 && BMI < 23) {
			System.out.println("정상체중");
		}else if(BMI >= 23 && BMI < 25) {
			System.out.println("과체중");
		}else if(BMI >= 25 && BMI < 30) {
			System.out.println("비만");
		}else if(BMI >= 30) {
			System.out.println("고도 비만");
		}
		//(bmi지수 = BMI)를 보고 조건에 따라 출력  
		
		
		
	
	
	
	
	
	
	}
}