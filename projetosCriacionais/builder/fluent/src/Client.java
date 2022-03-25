import model.FastFoodMeal;
import model.builder.FastFoodMealBuilder;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal burguer = new FastFoodMealBuilder("Fries").thatsAll();
		System.out.println(burguer.toString());
				
		
		burguer = new FastFoodMealBuilder("Cheps").andMain("Big Burguer").andGift("Vale 3 reais").forDrink("Coca-Cola").thatsAll();
		System.out.println(burguer.toString());
		
	}
}
