package snackex00;



public class SnackController {
	
	
	

	private Snack s = new Snack();
	
	public SnackController() {}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장 완료되었습니다.";
	}
	
	public String confirmData() {
		
		
	return null;
	//(4번)
	//return s.information();을 사용하고 이것은 s.information을 호출 뜻함
	//Snack 클래스에 있는 information로 가라는 뜻
	}
	
	
}
