package cz.spsejecna.topol;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LineCountMain {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Type in path: ");
		String o = sc.nextLine();
		try {
			File myObject = new File("C:\\Users\\PreVale\\Desktop\\text.txt");
			if (myObject.createNewFile()) {
				System.out.println("File created: " + myObject.getName() + " path: " + myObject.getAbsolutePath());
			} else {
				System.out.println("File already exists");
			}

			int linecount = 0;
			FileReader fr = new FileReader(o);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while ((s = br.readLine()) != null) {
				linecount++;
			}

			System.out.println("Number of lines in the Files:" + linecount);

			try {
				FileWriter myWriter = new FileWriter("C:\\Users\\HP\\Desktop\\text.txt");
				myWriter.write(linecount);
				myWriter.close();
				System.out.println("done");
			} catch (IOException e1) {
				System.err.println("An error has occured");
				e1.printStackTrace();

			}

		} catch (IOException e) {
			System.err.println("An error has occured");
			e.printStackTrace();
		}
	}
}
