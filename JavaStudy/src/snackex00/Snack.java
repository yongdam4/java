package snackex00;

public class Snack {

	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	public Snack() {
		super();
	}

	public Snack(String kind, String name, String flavor, int numOf, int price) {
		super();
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	public String information() {
		return null;
		//(5번)
		//String값을가진 info 생성함과 동시에 info안에 전체문장 출력해주는 코드를 넣는다
		//String info = this.kind +"(" + this.name + "-" + this.flavor + ")" + this.numOf + "개" + this.price + "원";	
		//
		//info로 반환한다는 이야기
		//return info;
		
		
		
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
}
