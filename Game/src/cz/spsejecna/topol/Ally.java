package cz.spsejecna.topol;

public class Ally extends Character {

	public Ally(String name, int level, boolean hostility, int attributePoints, int hp, int stamina, int mana,
			int strength, int dexterity, int intelligence, int endurance, int vitality) {
		super(name, level, hostility, attributePoints, hp, stamina, mana, strength, dexterity, intelligence, endurance,
				vitality);
	}
	
	protected int relationship = 100;

	public int getRelationship() {
		return relationship;
	}

	public void setRelationship(int relationShip) {
		this.relationship = relationShip;
		if(relationship < 0) {
			this.hostility = true;
		}
	}
	

}
