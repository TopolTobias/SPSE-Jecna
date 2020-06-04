
public class Obdelnik {

private double strana1;
private double strana2;

public void setStrana(double str1,double str2) {
	this.strana1 = str1;
	this.strana2 = str2;
}
	public double getStrana1() {
		return this.strana1;
	}
	public double getStrana2() {
		return this.strana2;
	}
	public Obdelnik() {
	}
	public Obdelnik(double str1) {
	this.strana1 = str1;
	}
	public Obdelnik(double str3,double str4) {
	this.strana1 = str3;
	this.strana2 = str4;
	}
	public String toString() {
	return"Obdelnik o strane"+this.strana1+" "+this.strana2;
	}
}