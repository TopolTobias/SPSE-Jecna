package cz.spsejecna.topol;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Array<T> implements Iterable<T> {

	protected List<T> List = new ArrayList<>();

	public Iterator<T> iterator() {
		return new CustomIterator<T>(List);
	}

	public void add(T value) {
		List.add(value);
	}
}