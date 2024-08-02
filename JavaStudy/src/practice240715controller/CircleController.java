package practice240715controller;

public class CircleController{
	
	
	private Circle c;
	
	public CircleController() {
		this.c = new Circle();
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double circum = Math.PI * c.getRadius() *2;
		return "둘레 : " + c.toString() +" / " + circum ;
		
	}

	
		public String calcArea(int x, int y, int radius) {
			c.setX(x);
			c.setY(y);
			c.setRadius(radius);
			double area = Math.PI * c.getRadius() * c.getRadius();
			return "넓이 : " + c.toString() + " / " + area;
	}
	
	
	
	
}
