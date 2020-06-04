package cz.spsejecna.topol;

public class Instrument {

	protected String tuning;

	public String getTuning() {
		return tuning;
	}

	public void setTuning(String tuning) {
		this.tuning = tuning;
	}

	public Instrument(String tuning) {
		super();
		this.tuning = tuning;
	}

}
