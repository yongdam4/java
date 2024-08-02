package gagex;

public class StudentController {

	private Student[] sArr = new Student[5];// sArr(배열)생성함과 동시에 Student[5] 호출
	// sArr[0], sArr[1], sArr[2], sArr[3], sArr[4]배열 생성
	
	public final int CUT_LINE = 60;// 모두 대문자로 쓰여진 변수는 상수이므로 CUT_LINE은 60으로 고정이 된다

	
	//StudentController 기본 생성자 생성
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디바", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}///2. 0~4까지의 index를 가지고있는 배열에 각자의 값을 대입하여 초기화시켜준다.
	
	
	//printStudent 생성자 생성
	public Student[] printStudent() {//Student[](배열) 형태로 사용해야된다는 뜻
	return sArr;///3. sArr배열을 채워주었으므로 sArr사용
	}
	
	
	//sumScore 생성자 생성
	public int sumScore() {//int 형으로 생성해야함
	///4. sArr배열의 점수를 합한 값 리턴
		int sum = 0;/// 연산식을 만들기 위해 sum을 0으로 초기화한후
		for(int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();///첫번째부터 sArr의 길이 까지 반복함과 동시에 
		}///점수의 합계를 구하기 위해 각각의 sArr에 sum + getScore()을 반복한다
		return sum;//sum으로 반환한다
	}//평균을 구하기 위해 총합 구함
	
	
	//avgScore생성자 생성
	public double[] avgScore() {//double[](배열) 형태로 사용해야함
		double[] avgArr = new double[2];//double 형이 없기때문에 avgArr(배열)를 생성함과 동시에 double[2]호출
		avgArr[0] = this.sumScore();//0번째 인덱스의 모든 점수의 합
		avgArr[1] = this.sumScore() / sArr.length;//1번째 인덱스의 평균
		return avgArr;
	}
	
	
}
