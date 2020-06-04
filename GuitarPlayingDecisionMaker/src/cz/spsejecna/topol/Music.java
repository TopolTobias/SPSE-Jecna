package cz.spsejecna.topol;

public class Music {

	protected String genre;
	protected String difficulty;
	protected boolean solo;
	protected String playstyle;

	public boolean isSolo() {
		return solo;
	}

	public void setSolo(boolean solo) {
		this.solo = solo;
	}

	public String getPlaystyle() {
		return playstyle;
	}

	public void setPlaystyle(String playstyle) {
		this.playstyle = playstyle;
	}
}
