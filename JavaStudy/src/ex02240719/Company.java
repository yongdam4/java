package ex02240719;

public class Company {

	public static void main(String[] args) {
		Employee[] ep = new Employee[2];
		
		ep[0] = new Secretary("Hilery", 1, "secretary", 800);
		ep[1] = new Sales("Clinten", 1, "secretary", 800);
		
		System.out.println("name"+ "         " + "department" + "        " + "salary");
		System.out.println("-----------------------------------------------");
		for(Employee e : ep) {
			System.out.println(e.getName() + "\t" + e.getDepartment() + "\t" + e.getSalary());
		}
		System.out.println("인센티브 100지급");
		((Secretary)ep[0]).incentive(100);
		((Sales)ep[1]).incentive(100);
		
		System.out.println("name"+ "         " + "department" + "        " + "salary");
		System.out.println("-----------------------------------------------");
		for(Employee e : ep) {
			System.out.println(e.getName() + "\t" + e.getDepartment() + "\t" + e.getSalary() + "\t" + e.tax());
		}
		
		
	}

}
