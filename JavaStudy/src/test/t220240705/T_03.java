package test.t220240705;
import java.util.Scanner;

public class T_03 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int[] arr = new int[3];// 길이가 3인 arr배열 생성
	for(int i = 0; i < arr.length; i++) {//i가 0에서 부터 arr.length()까지 1씩커지며 반복
		System.out.printf("입력 %d : " , i+1);//0~2가 반복이므로 1,2,3출력
		arr[i] = sc.nextInt();//내가입력한 arr[i]의 값 출력
		//arr[0],arr[1],arr[2] 값 출력 
	}
	/*
	if(arr[0] == arr[1] && arr[0] == arr[2]) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	*/
	System.out.println(arr[0] == arr[1] && arr[0] == arr[2]);
	//위의 경우일 경우 true, 아닌경우 false.
	
	
	
	
	/*
	System.out.print("입력1 : ");
	int num1 = sc.nextInt();
	System.out.print("입력2 : ");
	int num2 = sc.nextInt();
	System.out.print("입력3 : ");
	int num3 = sc.nextInt();
	
	if(num1 == num2 && num2 == num3) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	*/
	
	
	
	
	
	
	
	
	

}
}