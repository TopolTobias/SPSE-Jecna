import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DecisionMakerFinal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> options = new ArrayList<String>();

		System.out.println("How many options do you have?");
		int oc = sc.nextInt();

		System.out.println("Enter your options.");
		for (int i = 0; i <= oc; i++) {
			options.add(sc.nextLine());
		}

		DecisionMakerFinal program = new DecisionMakerFinal();
		System.out.println(program.getRandomElement(options));
		
		sc.close();
	}

	public String getRandomElement(ArrayList<String> options) {
		Random r = new Random();
		return options.get(r.nextInt(options.size()));
	}

}
