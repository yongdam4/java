package test.test240709;

public class Product {

	 private String pName;
	 private int  price;
	 private String brand;
	


	public Product(String pName, int price, String brand) {
		super();
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}

	
	
	public Product(String pName, int price) {
		super();
		this.pName = pName;
		this.price = price;
		
	}



	public Product() {
		super();
		System.out.println("생성자기본");
	}



	public String getpName() {
		return pName;
	}



	public void setpName(String pName) {
		this.pName = pName;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public void infomation() {
		System.out.println("제품 : " + this.pName + "가격 : " + this.price + "브랜드 : " + this.brand);
	}
	
}
