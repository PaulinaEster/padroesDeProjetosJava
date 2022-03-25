import builder.FastFoodMealBuilder;
import builder.FatMealBuilder;
import builder.JustFriesBuilder;
import director.MealDirector;

public class Client {

	public static void main(String[] args) {
		order("Burger", new FatMealBuilder());
		order("Burger", new JustFriesBuilder());

	}
	
	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructCombo();	
		System.out.println(director.getCombo());
		
		System.out.println("------------------");
	}
	
	
	

}
