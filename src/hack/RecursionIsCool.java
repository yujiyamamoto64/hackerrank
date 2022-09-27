package hack;

public class RecursionIsCool {

	public static void main(String[] args) {
		//sayHi(5);
		countBackwords(14);
	}
	
	public static void sayHi(int n) {
		if ( n == 0) {
			System.out.println("Done!");
		} else {
			System.out.println("Hi!");
			n--;
			sayHi(n);
		}
	}
	
	public static void countBackwords(int n) {
		if (n == 0) {
			System.out.println("Done!");
		} else {
			System.out.println(n);
			n--;
			countBackwords(n);
		}
	}
}
