package f.object.ex5;

//이름 나이 수학점수 영어점수 국어점수를 데이터로 가지고 있는 개체를 만들어라
//데이터는 직접 접근을 허용하지 않고  모두 간접적으로 set/get을 해줄수 있도록 작성해라
//모든 데이터를 매개변수로 받아 초기화하며 객체를 생성할 수 있는 생성자를 작성

public class Student {
//필드영역(데이터)
	private String name;
	private int age;
	private int mathsc;
	private int ensc;
	private int guksc;
	
	//생성자 영역 //alt + shift +s -> o
	public Student(String name, int age ,int math, int en, int guk) {
		this.name = name;
		this.age = age;
		this.mathsc = math;
		this.ensc = en;
		this.guksc = guk;
	}
	//메소드영역(기능)
	//getter,setter
	//alt + shift +s -> r


	
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public int getMathsc() {
		return mathsc;
	}




	public void setMathsc(int mathsc) {
		if(mathsc <  0) {
			this.mathsc = 0;
			return;
		}
		this.mathsc = mathsc;
	}




	public int getEnsc() {
		return ensc;
	}




	public void setEnsc(int ensc) {
		if(ensc <  0) {
			this.ensc = 0;
			return;
		}
		this.ensc = ensc;
	}




	public int getGuksc() {
		return guksc;
	}




	public void setGuksc(int guksc) {
		if(guksc <  0) {
			this.guksc = 0;
			return;
		}
		this.guksc = guksc;
	}




	public String getName() {
		return name;
	}




	public double getEvg() {
		double evg = (this.guksc + this.ensc + this.mathsc) /3.0;
	return evg;
	}
	
	public void printEvg() {
		System.out.println(this.getName() + "님의 평균 : " +  this.getEvg());
	}
	
	
}
