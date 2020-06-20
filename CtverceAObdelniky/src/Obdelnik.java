
public class Obdelnik {
	private double strana1;
	private double strana2;
	private Double double1;
	private Double double2;

//	Set nic nekontroluje
	/*
	 * public void setStrana(double str1, double str2) { this.strana1 = str1;
	 * this.strana2 = str2; }
	 */

	public void setStrana1(double strana1) {
		if (strana1 < 0) {
			this.strana1 = Math.abs(strana1);
			;
		} else if (strana1 > 0) {
			this.strana1 = strana1;
		} else {
			double1 = (Double) null;
			this.strana1 = double1;
		}
	}

	public void setStrana2(double strana2) {
		if (strana2 < 0) {
			this.strana2 = Math.abs(strana2);
		} else if (strana2 > 0) {
			this.strana2 = strana2;
		} else {
			double2 = (Double) null;
			this.strana2 = double2;
		}
	}

	public double getStrana1() {
		return this.strana1;
	}

	public double getStrana2() {
		return this.strana2;
	}

//	Konstruktor bez zadani jakychkoliv hodnot
	/*
	 * public Obdelnik() {
	 * 
	 * }
	 */
	public Obdelnik() {
		this.strana1 = 3;
		this.strana2 = 7;
	}

//	Konstruktor se zadanim pouze casti hodnot	
	/*
	 * public Obdelnik(double str1) { this.strana1 = str1; }
	 */
	public Obdelnik(double strana1) {
		setStrana1(strana1);
		this.strana2 = 7;
	}

//	Zbytecne pouziti dalsich promennych
	/*
	 * public Obdelnik(double str3, double str4) { this.strana1 = str3; this.strana2
	 * = str4; }
	 */
	
	// Konstruktor nebere hodnoty ze Setu
	public Obdelnik(double strana1, double strana2) {
		setStrana1(strana1);
		setStrana2(strana2);
	}

	public String toString() {
		return "Obdelnik o stranach " + this.strana1 + " a " + this.strana2;
	}
}