package gagex;
import java.util.Scanner;

public class StudentMenu {
	Scanner sc = new Scanner(System.in);//sc객체 생성과 동시에 Scanner() 호출
	StudentController ssm = new StudentController();//ssm객체 생성과 동시에 StudentController() 생성자호출
	
	
	
	//StudentMenu생성자 생성
	public StudentMenu() {
	System.out.println("========== 학생 정보 출력 =========");
	Student[] stArr = ssm.printStudent();
	for(int i = 0; i < stArr.length; i++) {
		String stInfo = stArr[i].inform();
		System.out.println(stInfo);
	}
	 System.out.println("========== 학생 성적 출력 ==========");
	 double[] avgArr = ssm.avgScore();
	 System.out.println("학생점수 합계 : " + avgArr[0]);
	 System.out.println("학생점수 평균 : " + avgArr[1]);
	 System.out.println("========== 성적 결과 출력 ==========");
	 for(int i = 0; i < stArr.length; i++) {
		 if(ssm.CUT_LINE > stArr[i].getScore()) {
			 System.out.println(stArr[i].getScore()  + "학생은 재시험대상입니다");
		 }else {
			 System.out.println(stArr[i].getScore()  + "학생은 통과입니다");
		 }
	 }
	 
	 
	}
	
}
