
public class Skrin extends Nabytek {

	String typ;

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	

	
	public Skrin() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	public Skrin(double hmotnost, String barva, String typ) {
		super(hmotnost, barva);
		this.typ = "satni";
	}

	@Override
	public String toString() {
		return "Skrin hmotnost=" + hmotnost + ", barva=" + barva + ", typ=" + typ;
	}

}
