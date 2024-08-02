package ex03240719;

public class PlaneTest {

	public static void main(String[] args) {
		
		Plane[] pn = new Plane[2];
		
		pn[0] = new Airplane("L737", 1000);
		pn[1] = new cargoplane("C40", 1000);
		
		System.out.println("Plane\t\t\t fuelSize" );
		System.out.println("----------------------------");
		for(Plane p : pn) {
			System.out.println(p.getPlaneName() + "\t\t\t" + p.getFuelSize());	
		}
		System.out.println("100 운항");
		System.out.println("----------------------------");
		((Airplane)pn[0]).flight(100);
		((cargoplane)pn[1]).flight(100);
		for(Plane p : pn) {
			System.out.println(p.getPlaneName() + "\t\t\t" + p.getFuelSize());	
		}
		
		System.out.println("200 주유");
		System.out.println("----------------------------");
		((Airplane)pn[0]).refuel(200);
		((cargoplane)pn[1]).refuel(200);
		for(Plane p : pn) {
			System.out.println(p.getPlaneName() + "\t\t\t" + p.getFuelSize());	
		}
		
		
	}

	

}
