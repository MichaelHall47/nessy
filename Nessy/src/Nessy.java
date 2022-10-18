import java.util.*;
public class Nessy {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int bill = 0;
		System.out.println("do you want a nessy doll");
		String meal = input.next();
		if(meal.contentEquals("yes")) {
			System.out.println("which color would you like");
			System.out.println("1 - green and white");
			System.out.println("2 - black and red");
			int mealType = input.nextInt();
			if(mealType == 1) {
				bill += 3;
			}else {
				bill += 4;
			}
		}
		System.out.println("would you like t-shirt with it");
		String drink = input.next();
		if(drink.equals("yes")) {
			System.out.println("which shirt would you like?");
			System.out.println("1 - one that has the nessy in the lake");
			System.out.println("2 - one with the nessy fighting in a boxing ring");
			int drinkType = input.nextInt();
			if(drinkType == 1) {
				bill += 2;
			}else {
				bill += 4;
			}
		}
		System.out.println("your bill comes out to $" + bill + ".");
	}
}
