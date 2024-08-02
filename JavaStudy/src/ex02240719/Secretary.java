package ex02240719;

public class Secretary extends Employee implements Bonus{

	public Secretary() {
		super();
	}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	
	
	public void incentive(int pay) {
		super.setSalary((int)(super.getSalary() + super.getSalary()* 1.8));
	}
	
	public double tax() {
		return this.getSalary() * 0.1;
	}

}
