package cz.spsejecna.topol;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Character Player = new Character(null, 1, false, 10, 10, 10, 10, 10, 10, 10, 10, 10);

		System.out.println("What is your name?");
		Player.setName(in.nextLine());
		if (Player.name.equalsIgnoreCase("ach jo")) {
			String easterEgg = "ape mode ";
			System.out.println(easterEgg + easterEgg + easterEgg + easterEgg + easterEgg + easterEgg + easterEgg
					+ easterEgg + easterEgg + easterEgg + "\n" + easterEgg + easterEgg + easterEgg + easterEgg
					+ easterEgg + easterEgg + easterEgg + easterEgg + easterEgg + easterEgg + "\n" + easterEgg
					+ easterEgg + easterEgg + easterEgg + easterEgg + easterEgg + easterEgg + easterEgg + easterEgg
					+ easterEgg + "\n" + easterEgg + easterEgg + easterEgg + easterEgg + easterEgg + easterEgg
					+ easterEgg + easterEgg + easterEgg + easterEgg + "\n" + easterEgg + easterEgg + easterEgg
					+ easterEgg + easterEgg + easterEgg + easterEgg + easterEgg + easterEgg + easterEgg);
			in.close();
		} else {
			Player.setAttributePoints(5);

			System.out.println("Very well, " + Player.getName()
					+ ". You have 5 attribute points. It's up to you to decide who you are.");
			System.out.println("You can add points to your strength, dexterity, intelligence, endurance, or vitality.");

			while (Player.getAttributePoints() > 0) {
				String answer = in.nextLine();
				if (answer.equalsIgnoreCase("strength")) {
					Player.strength++;
					Player.attributePoints--;
				}

				if (answer.equalsIgnoreCase("dexterity")) {
					Player.dexterity++;
					Player.attributePoints--;
				}

				if (answer.equalsIgnoreCase("intelligence")) {
					Player.intelligence++;
					Player.attributePoints--;
				}

				if (answer.equalsIgnoreCase("endurance")) {
					Player.endurance++;
					Player.attributePoints--;
				}

				if (answer.equalsIgnoreCase("vitality")) {
					Player.vitality++;
					Player.attributePoints--;
				}

			}
			System.out.println("Good. I hope these skills will serve you well.");
			System.out.println("Strength: " + Player.getStrength());
			System.out.println("Dexterity: " + Player.getDexterity());
			System.out.println("Intelligence: " + Player.getIntelligence());
			System.out.println("Endurance: " + Player.getEndurance());
			System.out.println("Vitality: " + Player.getVitality());
			System.out.println("\nBut you will learn during your journey as well, fear not.");

			System.out.println(
					"\nThe alarm's gone off. It's time to wake up. Going to school is necessary, after all. You are now facing a decision. Eat breakfast first, or go to school right away?");
			String decision = in.nextLine();

			if (decision == "eat breakfast" || decision == "have breakfast" || decision == "breakfast") {
				decision = "breakfast";
			} else if (decision == "go to school" || decision == "school") {
				decision = "school";
			}

			switch (decision) {
			case "breakfast":
				System.out.println("You no longer suffer from hunger, but you couldn't get to school on time.");
				break;
			case "school":
				System.out.println(
						"You can always eat later. Getting to school on time and keeping everything under control is important.");
				Player.setTired();
				System.out.println("But there is a price to pay for neglecting your other needs.");
				break;
			}

			System.out.println("You made it through the lessons. The time has come for another decision.");
			System.out.println("Go home or stay outside?");
			decision = in.nextLine();
			if (decision == "go home" || decision == "home") {
				decision = "home";
			} else if (decision == "stay outside" || decision == "outside") {
				decision = "outside";
			}
			switch (decision) {
			case "home":
				System.out.println("You have arrived home. You are now free from the shackles of society and can now regenerate.");
				Player.recoveredFromTiredness();
				break;
			case "outside":
				
			}

		}
	}

}
