
public class Nabytek {

	double hmotnost;

	String barva;

	public double getHmotnost() {

		return hmotnost;

	}

	public void setHmotnost(double hmotnost) {

		this.hmotnost = hmotnost;

	}

	public String getBarva() {

		return barva;

	}

	public void setBarva(String barva) {

		this.barva = barva;

	}

	public Nabytek() {

		super();

	}

	public Nabytek(double hmotnost, String barva) {

		super();

		this.hmotnost = hmotnost;

		this.barva = barva;

	}

	@Override

	public String toString() {

		return "hmotnost=" + hmotnost + ", barva=" + barva;

	}

}
