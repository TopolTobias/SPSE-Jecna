package cz.spsejecna.topol;

public class IterationMain {

	public static void main(String[] args) {

		Array<String> testList = new Array<>();

		testList.add("object 1");
		testList.add("object 2");
		testList.add("object 3");

		for(String string : testList) {
			System.out.println(string);
		}
	}

}
