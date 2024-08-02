package test.t220240705;
import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double ko, en, math;//double 형 변수 ko, en, math지정
		
		System.out.println("국어 : ");
		ko = sc.nextDouble();
		System.out.println("영어 : ");
		en = sc.nextDouble();
		System.out.println("수학 : ");
		math = sc.nextDouble();
		//각각 double형으로 값을 쓸 수 있게해준다
		
		
		int total = (int)(ko + en + math);//ko, en, math를 double 형으로 지정해주었지만
		//총합을 정수형으로 고쳐야하기때문에 더한뒤 (int)사용
		
		int evg = total / 3; //평균값 지정 및 계산
		
		System.out.println("\n총점 : " +  total);
		System.out.println("평균 : " +  evg);
		//출력
		
		
		
		
		
}
}