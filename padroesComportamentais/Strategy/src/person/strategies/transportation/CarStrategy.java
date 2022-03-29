package person.strategies.transportation;

public class CarStrategy  implements TransportationStrategy{

	@Override
	public void move() {
		System.out.println("I ride a car to go anywhere");
		
	}

}
