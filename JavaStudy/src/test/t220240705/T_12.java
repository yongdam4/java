package test.t220240705;
import java.util.Scanner;

public class T_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] gameArr = {"가위","바위","보"};
		int win = 0, draw = 0, loss=0;
		
		System.out.print("당신의 이름을 입력해 주세요. : ");
		String str = sc.next();
		
	
		
		while(true) {
		System.out.print("가위바위보 : ");
		String rsp = sc.next();
		
		if(rsp.equals("exit")) {
			System.out.printf("%d전 %d승 %d무 %d패", (win+draw+loss), win, draw, loss);
			break;
		}
	
		int rand = (int)(Math.random() * 3);
		String com = gameArr[rand] ;
		
		System.out.println("컴퓨터 : " + com);
		
		if(rsp.equals(com)) {
			System.out.println("비겼습니다");
			draw++;
		}else if((rsp.equals("가위") && com.equals("보"))||
		(rsp.equals("바위") && com.equals("가위")) ||
		(rsp.equals("보") && com.equals("바위"))) {
			System.out.println("이겼습니다.");
			win++;
		}else {
			System.out.println("졌습니다.");
			loss++;
		}
		
		}
		
		
		
		
		
		
		
		/*
		int rand = (int)(Math.random() * 100) + 1;
		System.out.println(rand);
		
		int[] arr = new int[1000];
		
		if(rand % 4 == 0) {
			System.out.println("컴퓨터 : 가위");
		}else if(rand % 2 == 0 && rand % 4 != 0) {
			System.out.println("컴퓨터 : 바위");
		}else {
			System.out.println("컴퓨터 : 보");
		}
		
		switch
		
		
		
		
		*/
		
		
		
		
		
		
		
		
		}
		}
