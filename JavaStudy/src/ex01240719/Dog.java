package ex01240719;

public class Dog extends Animal{
	public static final String PLACE = "애견카페";
	private int weight;

	public Dog() {
		super();
	}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void speak() {
		//변수에 쓰고싶은 말을 집어넣고 변수를 출력해도됨
		System.out.println( super.toString() + "몸무게는" + weight + "kg 입니다");
		
	}
	
	
	
	
	
	
}
