package ex03240719;

public class Airplane extends Plane{

	public Airplane() {
		
	}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	
	
	
	@Override
	public void refuel(int fuel) {
		super.setFuelSize((int)(super.getFuelSize()+fuel));
	}
	@Override
	public void flight(int distance) {
		super.setFuelSize((int)(super.getFuelSize() -(distance*3)));
	}

	
		
	
	

}
