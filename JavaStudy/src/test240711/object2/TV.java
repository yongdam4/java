package test240711.object2;

public class TV {

	private String mk;
	private int year;
	private int inc;
	private int price;
	
	
	public TV() {
		super();
	}


	public TV(String mk, int year, int inc, int price) {
		super();
		this.mk = mk;
		this.year = year;
		this.inc = inc;
		this.price = price;
	}


	public String getMk() {
		return mk;
	}


	public void setMk(String mk) {
		this.mk = mk;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getInc() {
		return inc;
	}


	public void setInc(int inc) {
		this.inc = inc;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

public void show() {
	System.out.printf("%s에서 만든 %d년형 %d인치 TV가격 : %d", this.mk,this.year, this.inc,this.price);
	}
	


}
