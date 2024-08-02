package h.inheritex1;

public class Run {

	public static void main(String[] args) {
//		Man man1 = new Man("김용담");
//		man1.tellYourName();
		
		BusinessMan man2 = new BusinessMan("김용담", "KH", "학생");
		man2.tellYourInfo();
		man2.tellYourName();
	}
}
