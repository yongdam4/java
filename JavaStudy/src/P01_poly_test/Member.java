package P01_poly_test;

public class Member {

	private String name;
	private int age;
	private char gender;
	private int couponCount;
	
	public Member() {
		super();
	}

	public Member(String name, int age, char gender,int couponCount) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.couponCount = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

	@Override
	public String toString() {
		return name + " " + age+ " " + gender+ " " +couponCount;
	}
	
	
	

}
