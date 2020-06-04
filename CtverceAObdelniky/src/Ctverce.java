
public class Ctverce {
private int strana;
	
	public void setStrana(int str){
		this.strana = str;
	}
	public int getStrana(){
	     return this.strana;
	}
	public Ctverce(){
	     this.strana = 1;
	}
	public Ctverce(int str){
	     this.strana = str;
	}
	
	public String toString(){
	     return "Ctverec o strane " + this.strana;
	}

}
