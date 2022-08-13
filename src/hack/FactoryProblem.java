package hack;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-factory/problem
 */

interface Food {
	public String getType();
}

class Pizza implements Food {
	public String getType() {
		return "Someone ordered a Fast Food!";
	}
}

class Cake implements Food {

	public String getType() {
		return "Someone ordered a Dessert!";
	}
}

class FoodFactory {
	
	public Food getFood(String order) {
		
		if (order.contains("cake")) {
			Food cake = new Cake();
			return cake;
		} else {
			Food pizza = new Pizza();
			return pizza;
		}
		
	}// End of getFood method

}// End of factory class

public class FactoryProblem {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		// creating the factory
		FoodFactory foodFactory = new FoodFactory();

		// factory instantiates an object
		Food food = foodFactory.getFood(sc.nextLine());

		System.out.println("The factory returned " + food.getClass());
		System.out.println(food.getType());

	}
}
