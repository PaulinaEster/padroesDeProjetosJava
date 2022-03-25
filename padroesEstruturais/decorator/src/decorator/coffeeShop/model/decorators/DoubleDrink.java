package decorator.coffeeShop.model.decorators;

import decorator.coffeeShop.model.Drink;

public class DoubleDrink extends DrinkDecorator{

	public DoubleDrink(Drink drink) {
		super(drink);
	}

	@Override
	public void serve() {
		drink.serve();
		drink.serve();
	}

	@Override
	public Double getPrice() {
		return drink.getPrice() + 0.75;
	}

}
