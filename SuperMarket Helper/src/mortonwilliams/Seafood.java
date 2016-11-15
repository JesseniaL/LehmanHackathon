package mortonwilliams;

import java.util.Scanner;
public class Seafood {

	
	public Seafood(){
//	public static void main (String[] args)
//	{
//		
		Scanner scn = new Scanner(System.in);
		
		//This sets the new food type
		food shrimp = new food();
		
		//These are the individual nutritional values
		shrimp.setCalories(479.997);
		shrimp.setCarbs(4.62);
		shrimp.setFats(7.99);
		shrimp.setProtein(92.26);
		//weight is out of 16 ounces
//	.	shrimp.setWeight(16);
		shrimp.setPrice(10);
		
		
		food tilapia = new food();
		tilapia.setCalories(432);
		tilapia.setCarbs(0);
		tilapia.setFats(8);
		tilapia.setProtein(89.6);
		//weight is out of 16 ounces
		tilapia.setWeight(16);
		tilapia.setPrice(4);
		
		food salmon = new food();
		salmon.setCalories(943.99);
		salmon.setCarbs(0);
		salmon.setFats(60.8);
		salmon.setProtein(92.79);
		//weight is out of ounces
		salmon.setWeight(16);
		salmon.setPrice(12);
		
		food cod = new food();
		cod.setCalories(373.33);
		cod.setCarbs(0);
		cod.setFats(2.67);
		cod.setProtein(80);
		//weight is out of ounces
		cod.setWeight(16);
		cod.setPrice(3);
		
		food seabass = new food();
		seabass.setCalories(0);
		seabass.setCarbs(0);
		seabass.setFats(0);
		seabass.setProtein(0);
		//weight is out of ounces
		seabass.setWeight(16);
		seabass.setPrice(0);
		
		food flounder = new food();
		flounder.setCalories(410.66);
		flounder.setCarbs(0);
		flounder.setFats(6);
		flounder.setProtein(29.86);
		//weight is out of ounces
		flounder.setWeight(16);
		flounder.setPrice(4.99);
		
		food snapper = new food();
		snapper.setCalories(0);
		snapper.setCarbs(0);
		snapper.setFats(0);
		snapper.setProtein(0);
		//weight is out of ounces
		snapper.setWeight(16);
		snapper.setPrice(0);
		
		food monkfish = new food();
		monkfish.setCalories(0);
		monkfish.setCarbs(0);
		monkfish.setFats(0);
		monkfish.setProtein(0);
		//weight is out of ounces
		monkfish.setWeight(16);
		monkfish.setPrice(0);	
	
		//I don't know how to take this data and put export it into use in another class
		
		
		System.out.println("Choose a fish \n 1) Shrimp \n 2) Tilapia \n 3) Salmon \n 4) Cod \n 5) Seabass \n 6) Flounder \n 7) Snapper \n 8) Monk Fish");
		int sf = scn.nextInt();
		
		if (sf == 1) {
			System.out.println("Your choice : Shrimp");
			System.out.println("The calories are " + shrimp.getCalories() + "\nThe amount of carbs " + shrimp.getCarbs() + " grams" + "\nThe amount fats " + shrimp.getFats() + " grams" + "\nThe amount of proteins " + shrimp.getProtein() + " gram"+ "\nThe amount of weight " + shrimp.getWeight() +" in ounces" + "\nThe price "+ shrimp.getPrice()+ " in USD's");
		}
	
		else if (sf == 2) {
			System.out.println("Your choice: Tilapia");
			System.out.println("The amount of calories " + tilapia.getCalories() + "\nThe amount of carbs " + tilapia.getCarbs() + " grams" + "\nThe amount of fats " + tilapia.getFats() +" grams" +"\nThe amount of protein " + tilapia.getProtein() + " grams" + "\nThe amount of weight " + tilapia.getWeight() + " in ounces" + "\nThe price " + tilapia.getPrice() + " in USD's");
		}
		else if (sf == 3) {
			System.out.println("Your choice: Salmon");
			System.out.println("The amount of calories " + salmon.getCalories() +"\nThe amount of carbs " + salmon.getCarbs() +" grams" + "\nThe amount of fat " + salmon.getFats() + " grams" + "\nThe amount of protein " + salmon.getProtein() +" grams" + "\n The amount of weight" + salmon.getWeight() + "in ounces"+ "\nThe price" + salmon.getPrice()+ " in USD's");	
		}
		else if (sf == 4) {
			System.out.println("Your choice: Cod");
			System.out.println("The amount of calories" +cod.getCalories() +"\nThe amount of carbs " + cod.getCarbs()+ " grams" + "\nThe amount of fats"+ cod.getFats() +" grams" + "\nThe amount of protein " + cod.getProtein() +" grams"+"\nThe amount of weight " + cod.getWeight()+ " grams" + "\nThe price "+cod.getPrice()+ "in USD's");
				
		}
		else if (sf == 5) {
			System.out.println("Your choice: Sea Bass");
			System.out.println("The amount of calories " + seabass.getCalories() + "\nThe amount of carbs " +seabass.getCarbs() +" grams" +"\nThe amount of fats " + seabass.getFats()+" grams" +"\nThe amount of protein " + seabass.getProtein() +" grams" + "\nThe amount of weight " + seabass.getWeight() +" in ounces" + "\nThe price " + seabass.getPrice() +" in USD's");
			
		}
		else if (sf == 6) {
			System.out.println("Your choice: Flounder");
			System.out.println("The amount of calories " +flounder.getCalories() + "\nThe amount of carbs " + flounder.getCarbs()+ " grams" +"\nThe amount of fats "+ flounder.getFats() + " grams" +"\nThe amount of protein " + flounder.getProtein()+ " grams" + "\nThe amount of weight " + flounder.getWeight() +" in ounces" + "\nThe price " +flounder.getPrice()+ " in USD's");
			
		}
		else if (sf == 7) {
			System.out.println("Your choice: Snapper");
			System.out.println("The amount calories " + snapper.getCalories() + "\nThe amount of carbs " + snapper.getCarbs() + " grams" + "\nThe amount of fats" + snapper.getFats()+ " grams" + "\nThe amount of protein " + snapper.getProtein() +" grams"  + "\nThe amount of weight " +snapper.getWeight() +" in ounces" + "\nThe price " + snapper.getPrice() +" in USD's");
				
		}
		
		else if (sf == 8) {
			System.out.println("Your choice: Monk Fish");
			System.out.println("The amount of calories" + monkfish.getCalories() + "\nThe amount of carbs " + monkfish.getCarbs() + " grams" + "\nThe amount of fats " + monkfish.getFats() + " grams" + "\nThe amount of protein " + monkfish.getProtein() + " grams" + "\nThe amount of weight " +monkfish.getWeight()+ " in ounces" + "\nThe price " +monkfish.getPrice() +" in USD's");
		}
		//System.out.println(monkfish.getCalories());
		scn.close();
//	public double getshrimpNutrition()
//		
//		{
//		return ( shrimp.getCalories() + "\n" + shrimp.getCarbs() + "\n" + shrimp.getFats() + "\n" + shrimp.getProtein() + "\n" + shrimp.getWeight() + "\n" + shrimp.getPrice());
//		}
//	
//	
//		System.out.println(shrimp.getCalories() + "\n" + shrimp.getCarbs() + "\n" + shrimp.getFats() + "\n" + shrimp.getProtein() + "\n" + shrimp.getWeight() + "\n" + shrimp.getPrice());
//}
//		
	}

}