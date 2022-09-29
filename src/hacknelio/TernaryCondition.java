package hacknelio;

public class TernaryCondition {

	public static void main(String[] args) {
		
		double price = 34.5;
		double discount = (price < 20.0) ? price * 0.1 : price * 0.05;
		System.out.println(price - discount);
		
		int result = (2 > 4) ? 50 : 80;
		System.out.println(result);
		
		String name = (10 != 3) ? "Alex" : "Maria";
		System.out.println(name);
		
		int num = 8;
		String msg = num > 10 ? "num is greater than 10" : "num is less than 10";
		System.out.println(msg);
	}
}
