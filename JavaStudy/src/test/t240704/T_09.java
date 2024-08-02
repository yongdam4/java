package test.t240704;
import java.util.Scanner;

public class T_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
					
		int[][] arr = new int[4][4];
		int value = 1;
		for(int j = 0; j < arr.length; j++) {
		for(int i = 0; i < arr[j].length; i++) {
			arr[j][i] = value++;
		}
	}
	for(int j = 0; j < arr.length; j++) {
		for(int i = 0; i < arr[j].length; i++) {
			System.out.print(arr[j][i] + "\t");
		}
		System.out.println();
	}
	
	}
}