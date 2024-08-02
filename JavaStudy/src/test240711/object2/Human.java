package test240711.object2;

public class Human {

	private String myname;
	private int mymoney;
	
	
	
	
	public Human(String myname, int mymoney) {
		super();
		this.myname = myname;
		this.mymoney = mymoney;
		
	}



	public String getMyname() {
		return myname;
	}



	public void setMyname(String myname) {
		this.myname = myname;
	}



	public int getMymoney() {
		return mymoney;
	}



	public void setMymoney(int mymoney) {
		this.mymoney = mymoney;
	}



	



	public void buy(TV tv) {
		
		if(tv.getPrice() <= this.mymoney) {
			System.out.println("");
			System.out.println(this.myname + "님의 구매내역");
			tv.show();
			this.mymoney -= tv.getPrice();
			System.out.println("남은 잔액 : " + this.mymoney);
		}else{
			System.out.println(this.myname + "님 잔액이 부족하여 구매 불가 합니다");
		}
	}
	
}
