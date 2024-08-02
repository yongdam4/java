package test0718.object2.ex2;

public class Circle implements Shape{
		private double radius;
		
	
		
		
		

		public Circle(double radius) {
	
			this.radius = radius;
		}




		@Override
		public double calculateArea() {
			return Math.PI  * this.radius  * this.radius;
		}
	

		
}
