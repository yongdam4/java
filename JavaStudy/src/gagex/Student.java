package gagex;

public class Student {
//필드 구현
	
	private String name;
	private String subject;
	private int score;
	//멤버변수 생성
	
	
	//기본생성자 생성
	public Student() {
		super();
	}

	//매개변수를 생성하는 Student 생성자 생성 
	public Student(String name, String subject, int score) {//매개변수 생성됨
		super();
		this.name = name;
		this.subject = subject;
		this.score = score;
		//this는 멤버변수 와 매개변수의 이름이 같을 때 사용
	}

	
//	getter()/setter() 메소드 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	//inform생성사 생성
	public String inform() {///1. Student 클래스의 모든 필드 값들을 합친다
		return "이름 : " + this.name  + "/ 과목 : " + this.subject + "/ 점수 : " + this.score;
	}//호출한 클래스에서 정해준 값을 대입하기위해 this를 사용한다
	
	
	

}
