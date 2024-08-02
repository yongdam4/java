package practice240715controller;

public class RectangleController {

	private Rectangle r;
	
	public RectangleController() {
		this.r = new Rectangle();
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		int perimeter = (height + width) *2;
		return "둘레 : " + r.toString() +" / " + perimeter ;
	}
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		int area = (height * width);
		return "넓이 : " + r.toString() +" / " + area ;
	}

	

}
