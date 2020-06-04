package cz.spsejecna.topol;

import java.util.List;
import java.util.Iterator;

public class CustomIterator<E> implements Iterator<E> {

	int i = 0;
	List<E> hiddenList;

	public CustomIterator(List<E> hiddenList) {
		this.hiddenList = hiddenList;
	}

	public boolean hasNext() {
		if (hiddenList.size() >= i + 1) {
			return true;
		} else {
			return false;
		}
	}

	public E next() {
		E value = hiddenList.get(i);
		i++;
		return value;
	}

}
