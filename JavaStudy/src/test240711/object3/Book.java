package test240711.object3;

public class Book {
	
	private String name;
	private String jang;
	private String jur;
	private int bn;
	
	
	
	public Book() {
		super();
	}

	public Book(String name, String jang, String jur, int bn) {
		super();
		this.name = name;
		this.jang = jang;
		this.jur = jur;
		this.bn = bn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJang() {
		return jang;
	}

	public void setJang(String jang) {
		this.jang = jang;
	}

	public String getJur() {
		return jur;
	}

	public void setJur(String jur) {
		this.jur = jur;
	}

	public int getBn() {
		return bn;
	}

	public void setBn(int bn) {
		this.bn = bn;
	}

	public String toString() {
		return "제목 : " + this.name + " 장르 : " + this.jang + " 저자 : " + this.jur + " 책번호 : " + this.bn;
	}
}
