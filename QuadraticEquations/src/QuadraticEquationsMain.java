import java.util.Scanner;

public class QuadraticEquationsMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Input 1:");
		double a = in.nextDouble();
		System.out.println("Input 2:");
		double b = in.nextDouble();
		System.out.println("Input 3:");
		double c = in.nextDouble();

		double result = b * b - 4.0 * a * c;

		if(result > 0.0) {
			double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
			System.out.println("The roots are: " + r1 + r2);
		} else if (result == 0.0) {
			double r1 = -b / (2.0 * a);
			System.out.println("The root is " + r1);
		} else {
			System.out.println("The equation has no roots.");
		}
	}

}
