import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DecisionMaker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> Studies = new ArrayList<String>();
		Studies.add("Study Maths");
		Studies.add("Study Physics");
		Studies.add("Study English");
		Studies.add("Study Electronics");
		Studies.add("Study Java");
		Studies.add("Study HTML");
		Studies.add("Study Music Theory");
		
		ArrayList<String> Games = new ArrayList<String>();
		Games.add("Play The Witcher 3");
		Games.add("Play Code Vein");
		Games.add("Play Dark Souls III");
		Games.add("Play Sekiro");
		Games.add("Play Divinity: Original Sin 2");
		Games.add("Play Date A Live");
		Games.add("Play Skyrim");
		Games.add("Play Fallout 4");
		Games.add("Play Elder Scrolls Online");
		Games.add("Play Nier: Automata");
		Games.add("Watch anime");
		Games.add("Play guitar");
		Games.add("Play bass");

		DecisionMaker program = new DecisionMaker();
		
		JOptionPane.showMessageDialog(null, program.getRandomElement(Games), "Decision Maker", 1);
	}

	public String getRandomElement(ArrayList<String> List) {
		Random rand = new Random();
		return List.get(rand.nextInt(List.size()));
	}

}
