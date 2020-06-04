
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Nabytek> nab = new ArrayList<Nabytek>();

		Stul s = new Stul(15.3, "bila", 4);

		nab.add(s);

		Zidle z = new Zidle(4.2, "hneda", "kozenka");

		nab.add(z);

		Skrin sk = new Skrin(21.6, "stribrna", "satni");

		nab.add(sk);

		for (int i = 0; i < nab.size(); i++) {

			System.out.println(nab.get(i));

		}

	}

}