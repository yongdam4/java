package exexex01;

import test.ex220240710.Snack;

public class SnackController {

	String kind;
	String name;
	String flavor;
	 int numOf;
	 int price;
	public String information() {
		
		String info = this.kind +"(" + this.name + "-" + this.flavor + ")" + this.numOf + "개" + this.price + "원";	
		return info;
		}
}
