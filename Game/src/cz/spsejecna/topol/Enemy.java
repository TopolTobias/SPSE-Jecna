package cz.spsejecna.topol;

public class Enemy extends Character {

	public Enemy(String name, int level, boolean hostility, int attributePoints, int hp, int stamina, int mana,
			int strength, int dexterity, int intelligence, int endurance, int vitality) {
		super(name, level, hostility, attributePoints, hp, stamina, mana, strength, dexterity, intelligence, endurance,
				vitality);
	}

	public void setHostility(boolean hostility) {
		this.hostility = true;
	}

}
