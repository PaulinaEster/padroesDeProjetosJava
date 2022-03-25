package decorator.coffeeShop.model;

public class Expresso implements Drink{

	@Override
	public void serve() {
		System.out.println("Add 50ml of expresso");
	}

	@Override
	public Double getPrice() {
		
		return 1.5;
	}

}
