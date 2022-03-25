package model;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal food = new FastFoodMeal.Builder("Fries").andDessert("IceCream").thatsAll();
		System.out.println(food);
		
		

	}

}
