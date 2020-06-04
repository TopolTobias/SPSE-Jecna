
public class Zidle extends Nabytek {

	String calouneni;

	public String getCalouneni() {
		return calouneni;
	}

	public void setCalouneni(String calouneni) {
		this.calouneni = calouneni;
	}

	

	public Zidle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Zidle(double hmotnost, String barva, String calouneni) {
		super(hmotnost, barva);
		// TODO Auto-generated constructor stub]
		this.calouneni = "kozenka";
	}

	@Override
	public String toString() {
		return "Zidle hmotnost=" + hmotnost + ", barva=" + barva + ", calouneni=" + calouneni;
	}

}
