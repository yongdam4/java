package test240715.object11;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수 num1, num2 , num3를 입력 받아 홀짝을 출력하라
		//입력 : 6 4 7
		//짝 짝 홀
		//정수(0~100)을 입력받아 0부터 입력받은 수까지 출력
		//입력 : 7
		//0 1 2 3 4 5 6 7
		/*
		System.out.println("입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 % 2 == 0 ) {
			System.out.print("짝" + " ");
		}else if(num1 % 2 != 0) {
			System.out.print("홀" + " ");
		}
		
		if(num2 % 2 == 0 ) {
			System.out.print("짝" + " ");
		}else if(num2 % 2 != 0) {
			System.out.print("홀" + " ");
		}
		
		if(num3 % 2 == 0 ) {
			System.out.print("짝" + " ");
		}else if(num3 % 2 != 0) {
			System.out.print("홀" + " ");
		}
		//if 문 사용해도되지만 삼항연산자 사용 해도됨
		//삼항 연산자  =   (조건문) ? 참일 때 나올 값 : 거짓일 때 나올 값
		*/
		/*
		System.out.println("입력 : ");
		int num = sc.nextInt();
		
		int count = 0;
	
		for(int i = 0; i <= num; i++) {
				System.out.print(i + " ");
		}
		
		 */
		/*
		int[] arr = new int[20]; // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
		
		System.out.print("입력 : " );
		for(int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			arr[num - 1]++;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
		
		//학생 10명을 생성하고 reTest를 실행한 후 모든 학생의 점수를 출력해라
		Student[] stArr = new Student[10];
		
		for(int i = 0; i< stArr.length; i++) {
			 stArr[i] = new Student();
			 
			 System.out.print("이름 : ");
				stArr[i].setName(sc.next());
				
				System.out.print("반 : ");
				stArr[i].setClassRoom(sc.nextInt());
				
				stArr[i].reTest();
		}
		System.out.printf("%5s %3s %4s %4s %4s","이름", "반", "자바", "sql", "실습");
		for(int i = 0; i < stArr.length; i++) {
		
			System.out.printf("%5s %3d %4.sf %4.2f %4.2f\n", stArr[i].getName(),
					stArr[i].getClassRoom(),stArr[i].getJavaScore(), stArr[i].getSqlScore(), stArr[i].getPracticeScore());
		}
	 
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
