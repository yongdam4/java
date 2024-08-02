package test.home;
import java.util.Scanner;

public class T_10 {
	public static void main(String args[] ) {
	 Scanner sc = new Scanner(System.in);
	 
	 
	 int[][] array = {{12, 41, 36, 56},{82, 10, 12, 61},{14, 16, 18, 78},{45, 26, 72, 23}};
	 int size = 0;
	 
	 for(int i = 0; i < array.length; i++) {
		 size += array[i].length;
	 }//행 갯수*열갯수(이중배열 arr[3][3]의 길이)를 구하는 방법
	 
	 int[] copyAr = new int[size];//size라는 크기를 가지는 copyAr 배열 선언 [12, 36,0,0,0,0,0,0,0,0,0,0,0,0,0]
	int copyIndex = 0; //copyIndex라는 변수 초기화 copyIndex는 copyAr[0],copyAr[1],copyAr[2].....이 하나하나를 표현해주는 변수라고 생각한다
	 
	//2차원배열 array를 전체 검사
	 for(int i = 0; i < array.length; i++) {
   	  for(int j = 0; j < array[i].length; j++) {
   		  
   		//2차원 배열의 i, j 의 요소가 3의 배수인지 확인
   		if(array[i][j] % 3 == 0) {
   			
   			//i, j 의 요소가 이미 copyAr에 들어있는 요소인지 확인
   			boolean isCountinue = false;
   			for(int k = 0; k < copyIndex; k++) {
   				if(copyAr[k] == array[i][j]) {
   					isCountinue = true; // copyAr[k]가 array[i][j] 와 같을때 isCountinue에 true 대입
   					break; //그 뒤 멈추기
   				}
   			}
   			
   			//isCountinue - > true일때는 반복값이 존재
   			//!isCouninue - > 반복값이 존재하지 않는다면 copyAr-> array[i][j] 대입
   			if(!isCountinue) {
   				copyAr[copyIndex++] = array[i][j]; //이 활동을 진행 한뒤 copyIndex값 1증가
   			//copyIndex += 1
   				}
   			} 
   	  	}
	 }
	 
	 //copyAr출력
	 System.out.print("copyAr : ");
	 for(int i = 0; i < copyIndex; i++) {
		 System.out.print(copyAr[i] + " ");
	 }
	 
	 }
	}

