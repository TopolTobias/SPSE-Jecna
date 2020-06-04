import java.util.Scanner;

public class FloatingNumbersMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Input number:");
		double a = in.nextDouble();
		System.out.print("Input second number:");
		double b = in.nextDouble();

		a = Math.round(a * 1000);
		a = a / 1000;

		b = Math.round(b * 1000);
		b = b / 1000;

		if (a==b) {
			System.out.println("They are the same up to three decimal places.");
		} else {
			System.out.println("They are different.");
		}
	}
}
