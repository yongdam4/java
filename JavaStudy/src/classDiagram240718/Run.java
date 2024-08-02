package classDiagram240718;

public class Run {

	public static void main(String[] args) {
		
		PhoneController phoneController = new PhoneController();
		
		String[] results = phoneController.method();
		
		for(String res : results) {
			System.out.println(res);
			System.out.println();
		}
		
		
		
	}

}
