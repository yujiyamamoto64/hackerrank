package hack;

public class PrintLoops {

	public static void main(String[] args) {

		for (int i = 0; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = 6; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
