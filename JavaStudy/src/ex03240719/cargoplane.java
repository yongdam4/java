package ex03240719;

public class cargoplane extends Plane{

	public cargoplane() {
		super();
	}



	public cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void refuel(int fuel) {
		 this.setFuelSize(getFuelSize()+fuel);
	
	}

	@Override
	public void flight(int distance) {
	
		 this.setFuelSize(getFuelSize() -(distance*5));
		
	}

}
