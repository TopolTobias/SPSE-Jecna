package cz.spsejecna.topol;

public class Character {

	protected String name;
	protected int level;
	protected boolean hostility;
	protected int attributePoints;
	protected int hp;
	protected int stamina;
	protected int mana;

	protected int strength;
	protected int dexterity;
	protected int intelligence;
	protected int endurance;
	protected int vitality;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel() {
		this.level = 1;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = 100;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = 100;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = 100;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = 10;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = 10;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = 10;
	}

	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = 10;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = 10;
	}

	public boolean getHostility() {
		return hostility;
	}

	public void setHostility(boolean hostility) {
		this.hostility = hostility;
	}

	public int getAttributePoints() {
		return attributePoints;
	}

	public void setAttributePoints(int attributePoints) {
		this.attributePoints = attributePoints;
	}

	public Character(String name, int level, boolean hostility, int attributePoints, int hp, int stamina, int mana,
			int strength, int dexterity, int intelligence, int endurance, int vitality) {
		super();
		this.name = name;
		this.level = level;
		this.hostility = hostility;
		this.attributePoints = attributePoints;
		this.hp = hp;
		this.stamina = stamina;
		this.mana = mana;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.endurance = endurance;
		this.vitality = vitality;
	}

	public void setTired() {
		this.endurance = endurance - 2;
	}

	public void recoveredFromTiredness() {
		this.endurance = endurance + 2;
	}
	
	public void setInjured() {
		this.strength = strength - 1;
		this.dexterity = dexterity - 2;
	}
	
	public void recoveredFromInjury() {
		this.strength = strength + 1;
		this.dexterity = dexterity + 2;
	}

}
