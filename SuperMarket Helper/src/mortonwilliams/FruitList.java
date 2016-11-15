package mortonwilliams;


public class FruitList {
	
	public static void main(String[] args){
		
		food apples = new food();
		
		apples.setPrice(1.37);
		apples.setCalories(95);
		apples.setWeight(5.3);
		apples.setFats(0.3);
		apples.setCarbs(25.0);
		apples.setProtien(0.5);
		
		food bananas = new food();
		
		bananas.setPrice(0.58);
		bananas.setCalories(105.0);
		bananas.setWeight(1.2);
		bananas.setFats(0.4);
		bananas.setCarbs(27.0);
		bananas.setProtien(1.3);
		
		food strawberry = new food();
		
		strawberry.setPrice(2.89);
		strawberry.setCalories(50.0);
		strawberry.setWeight(5.0);
		strawberry.setFats(0.0);
		strawberry.setCarbs(13.0);
		strawberry.setProtien(1.0);
		
		food cantaloupe = new food();
		
		cantaloupe.setPrice(0.54);
		cantaloupe.setCalories(186.0);
		cantaloupe.setWeight(19.5);
		cantaloupe.setFats(1.0);
		cantaloupe.setCarbs(45.0);
		cantaloupe.setProtien(4.6);
		
		food oranges = new food();
		
		oranges.setPrice(1.4);
		oranges.setCalories(45.0);
		oranges.setWeight(4.5);
		oranges.setFats(0.1);
		oranges.setCarbs(11.0);
		oranges.setProtien(0.9);
		
		food kiwi = new food();
		
		kiwi.setPrice(0.50);
		kiwi.setCalories(42.0);
		kiwi.setWeight(1.0);
		kiwi.setFats(0.4);
		kiwi.setCarbs(10.0);
		kiwi.setProtien(0.6);
		
		food grapes = new food();
		
		grapes.setPrice(2.1);
		grapes.setCalories(62.0);
		grapes.setWeight(3.2);
		grapes.setFats(0.3);
		grapes.setCarbs(16.0);
		grapes.setProtien(0.6);
		
		food cherries = new food();
		
		cherries.setPrice(3.59);
		cherries.setCalories(77.0);
		cherries.setWeight(5.5);
		cherries.setFats(0.5);
		cherries.setCarbs(19.0);
		cherries.setProtien(1.6);
		
		food apricot = new food();
		
		apricot.setPrice(1.19);
		apricot.setCalories(17.0);
		apricot.setWeight(1.2);
		apricot.setFats(0.1);
		apricot.setCarbs(3.9);
		apricot.setProtien(0.5);
		
		food mangoes = new food();
		
		mangoes.setPrice(4.20);
		mangoes.setCalories(201.0);
		mangoes.setWeight(12.0);
		mangoes.setFats(1.3);
		mangoes.setCarbs(50.0);
		mangoes.setProtien(2.8);
	
		System.out.println("Apples" + "(" + apples.getWeight() + "oz" + ")");
		System.out.println("Price " + "$" + apples.getPrice());
		System.out.println("Calories: " + (int) apples.getCalories());
		System.out.println("Fat: " + apples.getFats() + "g");
		System.out.println("Carbohydrates: " + (int) apples.getCarbs() + "g");
		System.out.println("Protien: " + apples.getProtien() + "g");
		
		System.out.println("\nBananas" + "(" + bananas.getWeight() + "oz" + ")");
		System.out.println("Price " + "$" + bananas.getPrice());
		System.out.println("Calories: " + (int) bananas.getCalories());
		System.out.println("Fat: " + bananas.getFats() + "g");
		System.out.println("Carbohydrates: " + (int) bananas.getCarbs() + "g");
		System.out.println("Protien: " + bananas.getProtien() + "g");
		
		System.out.println("\nStrawberries" + "(" + strawberry.getWeight() + "oz" + ")");
		System.out.println("Price " + "$" + strawberry.getPrice());
		System.out.println("Calories: " + (int) strawberry.getCalories());
		System.out.println("Fat: " + strawberry.getFats() + "g");
		System.out.println("Carbohydrates: " + (int) strawberry.getCarbs() + "g");
		System.out.println("Protien: " + strawberry.getProtien() + "g");
		
		System.out.println("\nCantaloupes" + "(" + cantaloupe.getWeight() + "oz" + ")");
		System.out.println("Price " + "$" + cantaloupe.getPrice());
		System.out.println("Calories: " + (int) cantaloupe.getCalories());
		System.out.println("Fat: " + cantaloupe.getFats() + "g");
		System.out.println("Carbohydrates: " + (int) cantaloupe.getCarbs() + "g");
		System.out.println("Protien: " + cantaloupe.getProtien() + "g");
		
		System.out.println("\nOranges" + "(" + oranges.getWeight() + "oz" + ")");
		System.out.println("Price " + "$" + oranges.getPrice());
		System.out.println("Calories: " + (int) oranges.getCalories());
		System.out.println("Fat: " + oranges.getFats() + "g");
		System.out.println("Carbohydrates: " + (int) oranges.getCarbs() + "g");
		System.out.println("Protien: " + oranges.getProtien() + "g");
		
		System.out.println("\nKiwi" + "(" + kiwi.getWeight() + "oz" + ")");
		System.out.println("Price " + "$" + kiwi.getPrice());
		System.out.println("Calories: " + (int) kiwi.getCalories());
		System.out.println("Fat: " + kiwi.getFats() + "g");
		System.out.println("Carbohydrates: " + (int) kiwi.getCarbs() + "g");
		System.out.println("Protien: " + kiwi.getProtien() + "g");
		
		System.out.println("\nGrapes" + "(" + grapes.getWeight() + "oz" + ")");
		System.out.println("Price " + "$" + grapes.getPrice());
		System.out.println("Calories: " + (int) grapes.getCalories());
		System.out.println("Fat: " + grapes.getFats() + "g");
		System.out.println("Carbohydrates: " + (int) grapes.getCarbs() + "g");
		System.out.println("Protien: " + grapes.getProtien() + "g");
		
		System.out.println("\nCherries" + "(" + cherries.getWeight() + "oz" + ")");
		System.out.println("Price " + "$" + cherries.getPrice());
		System.out.println("Calories: " + (int) cherries.getCalories());
		System.out.println("Fat: " + cherries.getFats() + "g");
		System.out.println("Carbohydrates: " + (int) cherries.getCarbs() + "g");
		System.out.println("Protien: " + cherries.getProtien() + "g");
		
		System.out.println("\nApricots" + "(" + apricot.getWeight() + "oz" + ")");
		System.out.println("Price " + "$" + apricot.getPrice());
		System.out.println("Calories: " + (int) apricot.getCalories());
		System.out.println("Fat: " + apricot.getFats() + "g");
		System.out.println("Carbohydrates: " + (int) apricot.getCarbs() + "g");
		System.out.println("Protien: " + apricot.getProtien() + "g");
		
		System.out.println("\nMangoes" + "(" + mangoes.getWeight() + "oz" + ")");
		System.out.println("Price " + "$" + mangoes.getPrice());
		System.out.println("Calories: " + (int) mangoes.getCalories());
		System.out.println("Fat: " + mangoes.getFats() + "g");
		System.out.println("Carbohydrates: " + (int) mangoes.getCarbs() + "g");
		System.out.println("Protien: " + mangoes.getProtien() + "g");
		
		
		
		
	}

}