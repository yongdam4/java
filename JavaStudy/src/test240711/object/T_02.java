package test240711.object;
import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수 num을 입력받아 크기가 num인 정수형 배열을 만들고1~100사이의 랜덤값으로 모든 배열의 인덱스값을 대입합니다
		//이후 모든 배열의 값을 출력하고 홀수 인덱스의 값을 더한 값을 출력하세요
		
		//5 42 3 10 5
		//홀수 index의 합 : 52
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		//1~100중 랜덤값을 통해서 배열 초기화
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 100) + 1; 
			arr[i] = random;
			
			}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(i % 2 == 1) {
				sum += arr[i];
			}
			}
		System.out.println();
		System.out.println("홀수 index 총 합 : " + sum);
		
		
		
		
		
		
	}
}
