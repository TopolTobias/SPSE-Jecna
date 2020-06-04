package cz.spsejecna.topol;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DecisionMakerFinalMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> options = new ArrayList<String>();

		String response = JOptionPane.showInputDialog("How many options do you have?");
		int oc = Integer.parseInt(response);


		for (int i = 0; i <= oc; i++) {
			response = JOptionPane.showInputDialog("Enter your options.");
			options.add(response);
		}

		DecisionMakerFinalMain program = new DecisionMakerFinalMain();
		JOptionPane.showMessageDialog(null, program.getRandomElement(options), "The decision has been made.", 1);

	}

	public String getRandomElement(ArrayList<String> options) {
		Random r = new Random();
		return options.get(r.nextInt(options.size()));
	}

}
