package mortonwilliams;
//import java.util.Scanner;
//import java.awt.print.*;
//import java.awt.*;

public class Vegetable {
	
	private String nameofveg;
	double weight;
	double price;
	double fats;
	double carbs;
	double protein;
	double calories;
		
	Vegetable (String n) {
		this.nameofveg = n;
		numVegetables++;
			
			
		if (n.equals("Black Beans")) 
			bbeans(n);
			
		else if (n.equals("Cilantro")) 
			cilantro(n);
			
		else if (n.equals("Brussels sprouts"))
			brusselssprouts(n);
			
		else if (n.equals("Carrots"))
			carrots(n);
			
		else if (n.equals("Kale"))
			kale(n);
			
		else if (n.equals("Sweet Corn"))
			corn(n);
			
		else if (n.equals("Mushrooms"))
			mushroom(n);
			
		else if (n.equals("Onion"))
			onion(n);
			
		else if (n.equals("Garlic"))
			garlic(n);
			
		else if (n.equals("Avocado"))
			avocado(n);
			
		else if (n.equals("Spinach"))
			spinach(n);
			
		else if (n.equals("Cucumber"))
			cucumber(n);
			
		else if (n.equals("Potato"))
			potato(n);
			
		else if (n.equals("Green Pepper"))
			greenpepper(n);
			
		else
			System.out.println("ERROR!");
		}
		
		private static int numVegetables = 0;

		
		// Information of each vegetable
		public void bbeans (String b) {
			weight = 16;
			price = 1.99;
			fats = 0;
			carbs = 23;
			protein = 9;
			calories = 70;
		}
		
		
		public void cilantro(String c) {
			weight = 2.8;
			price = 1;
			fats = .42;
			carbs = 2.91;
			protein = 1.68;
			calories = 19.6;
		}
		
		public void brusselssprouts(String b) {
			weight = 16;
			price = 1.36;
			fats = 1.36;
			carbs = 40.6;
			protein = 15.33;
			calories = 195;
		}
		
		public void carrots(String c) {
			weight = 4.42;
			price = .74;
			fats = .3;
			carbs = 11.7;
			protein = 1.1;
			calories = 51.38;
		}
		
		public void kale(String k) {
			weight = 16;
			price = 2.81;
			fats = 3.18;
			carbs = 45.41;
			protein = 14.97;
			calories = 227;
		}
		
		public void corn(String c) {
			weight = 16;
			price = 2.69;
			fats = 5.39;
			carbs = 86.26;
			protein = 14.61;
			calories = 390;
		}
		
		public void mushroom(String m) {
			weight = 16;
			price = 3.41;
			fats = 1.54;
			carbs = 14.88;
			protein = 14.02;
			calories = 100;
		}
		
		public void onion(String o) {
			weight = 16;
			price = 1.04;
			fats = .39;
			carbs = 45.86;
			protein = 4.17;
			calories = 191;
		}
		
		public void garlic(String g) {
			weight = 16;
			price = 3.27;
			fats = 0.14;
			carbs = 9.37;
			protein = 1.8;
			calories = 42;
		}
		
		public void avocado(String a) {
			weight = 16;
			price = 2.24;
			fats = 29.47;
			carbs = 17.15;
			protein = 4.02;
			calories = 322;
		}
		
		public void spinach(String s) {
			weight = 16;
			price = 3.83;
			fats = 1.77;
			carbs = 16.47;
			protein = 12.97;
			calories = 104; 
		}
		
		public void cucumber(String c) {
			weight = 16;
			price = 1.30;
			fats = .5;
			carbs = 16.47;
			protein = 2.95;
			calories = 68;
		}
		
		public void potato(String p) {
			weight = 32;
			price = 2.06;
			fats = 74;
			carbs = 158.57;
			protein = 18.44;
			calories = 698.46;
		}
		
		public void greenpepper(String gp) {
			weight = 16;
			price = 1.41;
			fats = .77;
			carbs = 21.05;
			protein = 3.9;
			calories = 91;
		}
		
		/*
		 Got the information from fatsecret (calories, fat, carbs, protein) 
		 and from http://www.ers.usda.gov/data-products/fruit-and-vegetable-prices/
		 as well as foodcop.com/produce for prices
		 */
		
		// This return function let's me be able to print the information as listed
		public String toString() {
			return nameofveg + "\nCarbs: " + carbs + "\nFat: " + fats + " g" + "\nProteins: " + protein + " g" + "\nCalories: " + calories + "\nWeights: " + weight + " oz" + "\nCosts: $" + price;
		}
		
		public static int getNumVegetables() {
			return numVegetables;
		}

		// Some Getters and Setters
		public double getWeight() {
			return weight;
		}
				
		public void setWeight(double w) {
			this.weight = w;
		}
				
		public double getPrice() {
			return price;
		}
				
		public void setPrice(double p) {
			this.price = p;
		}
				
		public double getFats() {
			return fats;
		}
				
		public void setFats(double f) {
			this.fats = f;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Vegetable information is the following");
		
		//Getting user string input
		/*Scanner key = new Scanner(System.in);
		String k = key.next();
		System.out.println(k);*/
		
		
		Vegetable[] arrayOfVegetables = new Vegetable[14];
		
		arrayOfVegetables[0] = new Vegetable("Black Beans");
		arrayOfVegetables[1] = new Vegetable("Cilantro");
		arrayOfVegetables[2] = new Vegetable("Brussels sprouts");
		arrayOfVegetables[3] = new Vegetable("Carrots");
		arrayOfVegetables[4] = new Vegetable("Kale");
		arrayOfVegetables[5] = new Vegetable("Sweet Corn");
		arrayOfVegetables[6] = new Vegetable("Mushrooms");
		arrayOfVegetables[7] = new Vegetable("Onion");
		arrayOfVegetables[8] = new Vegetable("Garlic");
		arrayOfVegetables[9] = new Vegetable("Avocado");
		arrayOfVegetables[10] = new Vegetable("Spinach");
		arrayOfVegetables[11] = new Vegetable("Cucumber");
		arrayOfVegetables[12] = new Vegetable("Potato");
		arrayOfVegetables[13] = new Vegetable("Green Pepper"); 
		
		System.out.println(arrayOfVegetables[0]);
	}

}
