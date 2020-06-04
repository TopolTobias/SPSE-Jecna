
public class Stul extends Nabytek {

	int Nohy;

	public int getNohy() {
		return Nohy;
	}

	public void setNohy(int nohy) {
		Nohy = nohy;
	}

	

	public Stul() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stul(double hmotnost, String barva, int Nohy) {
		super(hmotnost, barva);
		this.Nohy = 4;
	}

	@Override
	public String toString() {
		return "Stul hmotnost=" + hmotnost + ", barva=" + barva + ", nohy=" + Nohy;
	}

	
	
	
}
