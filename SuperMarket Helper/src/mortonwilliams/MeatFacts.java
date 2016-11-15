package mortonwilliams;

import java.util.Scanner;
public class MeatFacts {
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		FoodFacts steak = new FoodFacts();
		// Basing Steak off of T-Bone steaks//
		steak.setPrice(11.99); //Dollars//
		steak.setWeight(16); //out of ounces// 
		steak.setCalories(962);
		steak.setFats(61.94); //out of grams//
		steak.setCarbs(0); //out of grams//
		steak.setProtein(87.95); //out of grams//
		
		FoodFacts bacon = new FoodFacts();
		//Based Bacon  off of Pork Bacon//
		bacon.setPrice(5);//dollars//
		bacon.setWeight(16);//ounces//
		bacon.setCalories(2418);
		bacon.setFats(182.8);//grams//
		bacon.setCarbs(6.8);//grams//
		bacon.setProtein(173.91);//grams//
		
		FoodFacts chicken = new FoodFacts();
		chicken.setPrice(3.75);//dollars//
		chicken.setWeight(16);//ounces//
		chicken.setCalories(793);
		chicken.setFats(55.48);//grams//
		chicken.setCarbs(0);//grams//
		chicken.setProtein(67.87);//grams//
		
		FoodFacts lamb  = new FoodFacts();
		lamb.setPrice(19.5);//dollars//
		lamb.setWeight(16);//ounces//
		lamb.setCalories(800);
		lamb.setFats(66.08);//grams//
		lamb.setCarbs(0);//grams//
		lamb.setProtein(49.44);//grams//
		
		FoodFacts pork = new FoodFacts();
		pork.setPrice(5.91);//dollars//
		pork.setWeight(16);//ounces//
		pork.setCalories(656);
		pork.setFats(40.96);//grams//
		pork.setCarbs(0);//grams//
		pork.setProtein(65.6);//grams//
		
		FoodFacts turkey = new FoodFacts();
		turkey.setPrice(0.96);//dollars//
		turkey.setWeight(16);//ounces//
		turkey.setCalories(540);
		turkey.setFats(12.97);//grams//
		turkey.setCarbs(0);//grams//
		turkey.setProtein(98.75);//grams//
		
		System.out.println("Choose a meat \n 1)Steak \n 2)Bacon \n 3)Chicken \n 4)Lamb \n 5)Pork \n 6)Turkey ");
		int sf = scn.nextInt();
		
		if(sf == 1) { 
			System.out.println("Your choice is : Steak ");
			System.out.println("The price is $" + steak.getPrice());
			System.out.println("The amount you are getting is " + steak.getWeight() + " ounces");
			System.out.println("The amount of calories for the amount you are getting is " + steak.getCalories());
			System.out.println("The amount of fat for the amount that you are getting is " + steak.getFats() + " grams");
			System.out.println("The amount of carbohydrates for the amount that you are getting is " + steak.getCarbs() + " grams");
			System.out.println("The amount of protein for the amount that you are getting is " + steak.getProtein() + " grams");
		}
		
		else if(sf == 2) { 
			System.out.println("Your choice is : Bacon ");
			System.out.println("The price is $" + bacon.getPrice());
			System.out.println("The amount you are getting is " + bacon.getWeight() + " ounces");
			System.out.println("The amount of calories for the amount you are getting is " + bacon.getCalories());
			System.out.println("The amount of fat for the amount that you are getting is " + bacon.getFats() + " grams");
			System.out.println("The amount of carbohydrates for the amount that you are getting is " + bacon.getCarbs() + " grams");
			System.out.println("The amount of protein for the amount that you are getting is " + bacon.getProtein() + " grams");
		}
		
		else if(sf == 3) { 
			System.out.println("Your choice is : Chicken ");
			System.out.println("The price is $" + chicken.getPrice());
			System.out.println("The amount you are getting is " + chicken.getWeight() + " ounces");
			System.out.println("The amount of calories for the amount you are getting is " + chicken.getCalories());
			System.out.println("The amount of fat for the amount that you are getting is " + chicken.getFats() + " grams");
			System.out.println("The amount of carbohydrates for the amount that you are getting is " + chicken.getCarbs() + " grams");
			System.out.println("The amount of protein for the amount that you are getting is " + chicken.getProtein() + " grams");
		}
		
		else if(sf == 4) { 
			System.out.println("Your choice is : Lamb ");
			System.out.println("The price is $" + lamb.getPrice());
			System.out.println("The amount you are getting is " + lamb.getWeight() + " ounces");
			System.out.println("The amount of calories for the amount you are getting is " + lamb.getCalories());
			System.out.println("The amount of fat for the amount that you are getting is " + lamb.getFats() + " grams");
			System.out.println("The amount of carbohydrates for the amount that you are getting is " + lamb.getCarbs() + " grams");
			System.out.println("The amount of protein for the amount that you are getting is " + lamb.getProtein() + " grams");
		}
		
		else if(sf == 5) { 
			System.out.println("Your choice is : Pork ");
			System.out.println("The price is $" + pork.getPrice());
			System.out.println("The amount you are getting is " + pork.getWeight() + " ounces");
			System.out.println("The amount of calories for the amount you are getting is " + pork.getCalories());
			System.out.println("The amount of fat for the amount that you are getting is " + pork.getFats() + " grams");
			System.out.println("The amount of carbohydrates for the amount that you are getting is " + pork.getCarbs() + " grams");
			System.out.println("The amount of protein for the amount that you are getting is " + pork.getProtein() + " grams");
		}
		
		else if(sf == 6) { 
			System.out.println("Your choice is : Turkey ");
			System.out.println("The price is $" + turkey.getPrice());
			System.out.println("The amount you are getting is " + turkey.getWeight() + " ounces");
			System.out.println("The amount of calories for the amount you are getting is " + turkey.getCalories());
			System.out.println("The amount of fat for the amount that you are getting is " + turkey.getFats() + " grams");
			System.out.println("The amount of carbohydrates for the amount that you are getting is " + turkey.getCarbs() + " grams");
			System.out.println("The amount of protein for the amount that you are getting is " + turkey.getProtein() + " grams");
		}
	

	}
	
}