package decorator.coffeeShop;

import decorator.coffeeShop.model.*;
import decorator.coffeeShop.model.decorators.*;

public class Client {

	public static void main(String[] args) {
		Drink tea = new Tea();
		tea.serve();
		System.out.println("Valor Tea: " + tea.getPrice());
		System.out.println("-------------------------------------");
		Drink coffee = new Expresso();
		coffee.serve();
		System.out.println("Valor Expresso: " + coffee.getPrice());
		
		
		System.out.println("-------------------------------------");
		Drink milk = new Milk(new DoubleDrink(new Expresso()));
		milk.serve();
		System.out.println("Valor Expresso duplo with Milk: " + milk.getPrice());
		

	}

}
