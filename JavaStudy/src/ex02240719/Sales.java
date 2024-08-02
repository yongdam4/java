package ex02240719;

public class Sales extends Employee implements Bonus{

	public Sales() {
		
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	public void incentive(int pay) {
		super.setSalary((int)(super.getSalary() * (pay * 1.2)));
	}
	
	public double tax() {
		return this.getSalary() * 0.13;
	}
	

	
}
