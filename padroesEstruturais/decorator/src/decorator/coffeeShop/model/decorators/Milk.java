package decorator.coffeeShop.model.decorators;

import decorator.coffeeShop.model.Drink;

public class Milk extends DrinkDecorator{

	public Milk(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serve() {
		drink.serve();
		System.out.println("Add 30ml of Milk");
		
	}

	@Override
	public Double getPrice() {
		return drink.getPrice() + 0.5;
	}

}
