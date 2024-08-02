package test.t220240705;
import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요(- 포함)");
		String str = sc.next();
		//번호를 입력하라고 했지만 -기호도 포함하라고 했기때문에 String을 
		//사용해 문자열 입력
		
		char gender = str.charAt(7);
		//gender값에 strd의 7번째 인덱스 값 즉,  내가쓴 문자열의 8번째 문자를 대입한다
		
		switch(gender) {
		
		case '1':
		case '3':
			System.out.println("남자");
			break;//조건이 gender값이 1 or 3이면 "남자"가 나오고 스위치 문에서 빠져나온다
		case '2':
		case '4':
			System.out.println("여자");
		break;	//조건이 gender값이 2 or 4이면 "여자"가 나오고 스위치 문에서 빠져나온다
		default:
				System.out.println("잘못 입력하셨습니다.");
				//위 case n에 해당되는게 없다면 default 값 출력
		}
	
	
	
	
	
	
	
	
	}
}