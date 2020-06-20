import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Pridani bloku try-catch
		try {
			System.out.println("Vytváøení ètvercù");
			System.out.println("Zadej stranu ctverce: ");

//	( Zalozeni promenne bez dalsiho pouziti )
//	int stranaCtv;
			Scanner sc = new Scanner(System.in);
			int strCt = sc.nextInt();

			Ctverce c1 = new Ctverce();
			Ctverce c2 = new Ctverce(7);
			Ctverce c3 = new Ctverce(strCt);

			System.out.println("c1: " + c1);
			System.out.println("c2: " + c2);
			System.out.println("c3: " + c3);

			// Spatne dana zavorka
			/*
			 * }
			 */

// 	Chybel strednik
//	System.out.println("Vytvareni obdelniku")
			System.out.println("Vytvareni obdelniku");

			System.out.println("Zadejte první stranu obdélníku");

			double stranaOb1;
			double stranaOb2;

//	Zbytecne zalozeny Scanner
//	Scanner sc2 = new Scanner(System.in);

// 	Spatne pojmenovana promena - neshoduje se s 
//	stranaObd1 = sc.nextDouble();
			stranaOb1 = sc.nextDouble();

			System.out.println("Zadejte druhou stranu obdélníku");

//	Zbytecne zalozeny Scanner
//	Scanner sc3 = new Scanner(System.in);

//	Spatne pojmenovana promena 
//	stranaObd2 = sc.nextDouble();
			stranaOb2 = sc.nextDouble();

//	( Pouze zalozeni objektu bez dalsiho pouziti; pridani jejich vypsani )
			Obdelnik o1 = new Obdelnik();
			Obdelnik o2 = new Obdelnik();
			Obdelnik o3 = new Obdelnik(stranaOb1);
			Obdelnik o4 = new Obdelnik();
			Obdelnik o5 = new Obdelnik(stranaOb1, stranaOb2);

			System.out.println("o1: " + o1);
			System.out.println("o2: " + o2);
			System.out.println("o3: " + o3);
			System.out.println("o4: " + o4);
			System.out.println("o5: " + o5);

//	Uzavreni Scanneru
			sc.close();
			
		} catch (NullPointerException e) {
			System.out.println("K vytvoreni je potreba zadat nenulovou hodnotu.");
		}
	}
}