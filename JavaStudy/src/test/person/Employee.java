package test.person;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(int salary, String dept) {
		super();
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return null;
	}
	
	
	
	
}
