package test.t240704;

import java.util.Scanner;

public class T_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("양의 정수 : ");
		num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		
		}
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		
		
		
}
}