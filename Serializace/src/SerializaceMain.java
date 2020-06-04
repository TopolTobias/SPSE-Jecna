import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.TreeSet;

public class SerializaceMain {

	public static void main(String[] args) {

		// Uloha 1
		TreeSet<String> kolekce = new TreeSet<String>();
		kolekce.add("MEWTWO");
		kolekce.add("REGIGIGAS");
		kolekce.add("GARCHOMP");
		for (String p : kolekce) {
			System.out.println(p);
		}
		
		try {
		FileOutputStream file = new FileOutputStream("kolekce-pokemonu.dat");
		ObjectOutputStream object = new ObjectOutputStream(file);
			object.writeObject(kolekce);

		file.close();
		object.close();
		System.out.println("Serializace prosla uspesne.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Uloha 2
		/*
		 * TreeSet<Pokemon> kolekce2 = new TreeSet<Pokemon>(); kolekce2.add(new
		 * Pokemon("MEWTWO","Genetický Pokémon")); kolekce2.add(new
		 * Pokemon("REGIGIGAS","Colossal Pokémon")); kolekce2.add(new
		 * Pokemon("GARCHOMP","Mach Pokémon")); for(Pokemon p2 : kolekce2) {
		 * System.out.println(p2.jmeno+"/"+p2.druh); }
		 */
	}
}
