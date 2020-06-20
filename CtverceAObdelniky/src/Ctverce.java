
public class Ctverce {
	private int strana;
	private Integer integer;

//	Set nic nekontroluje
	/*
	 * public void setStrana(int str){ this.strana = str; }
	 */
	public void setStrana(int strana) {
		if (strana < 0) {
			this.strana = Math.abs(strana);
		} else if (strana > 0) {
			this.strana = strana;
		} else {
			integer = (Integer) null;
			this.strana = integer;
		}
	}

	public int getStrana() {
		return this.strana;
	}

	public Ctverce() {
		this.strana = 1;
	}

	// Konstruktor nebere hodnoty ze Setu
	public Ctverce(int strana) {
		setStrana(strana);
	}

	public String toString() {
		return "Ctverec o strane " + this.strana;
	}

}
