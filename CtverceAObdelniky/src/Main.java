import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	System.out.println("Vytváøení ètvercù");
	System.out.println("Zadej stranu ctverce: ");
	
	int stranaCtv;
	Scanner sc = new Scanner(System.in);
	int strCt = sc.nextInt();
	
	Ctverce c1 = new Ctverce();
	Ctverce c2 = new Ctverce(7);
	Ctverce c3 = new Ctverce(strCt);
	
	
	System.out.println("c1: " + c1);
	System.out.println("c2: " + c2);
	System.out.println("c3: " + c3);
}
	System.out.println("Vytvareni obdelniku")
	System.out.println("Zadejte první stranu obdélníku");
	double stranaOb1;
	double stranaOb2;
	Scanner sc2 = new Scanner(System.in);
	stranaObd1 = sc.nextDouble();


	System.out.println("Zadejte druhou stranu obdélníka");
	Scanner sc3 = new Scanner(System.in);
	stranaObd2 = sc3.nextDouble();
	Obdelnik o1 = new Obdelnik();
	Obdelnik o2 = new Obdelnik();
	Obdelnik o3 = new Obdelnik(stranaOb1);
	Obdelnik o4 = new Obdelnik();
	Obdelnik o5 = new Obdelnik(stranaOb1 , stranaOb2);
}
}