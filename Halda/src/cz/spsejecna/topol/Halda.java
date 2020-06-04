package cz.spsejecna.topol;

public class Halda {

	public final int DEFAULT_BUFFER_SIZE = 16;
	int[] array;
	int virtualSize = 0;

	public int getParent(int i) {
		if (i % 2 == 0) {
			return (i - 1) / 2;
		}
		return i / 2;
	}

	public int getLeftChild(int i) {
		return 2 * i + 1;
	}

	public int getRightChild(int i) {
		return 2 * i + 2;
	}

	public void insert(int v) {
		if (virtualSize <= 0) {
			virtualSize = 1;
			array = new int[DEFAULT_BUFFER_SIZE];
			array[virtualSize - 1] = v;
		} else {
			if (virtualSize >= array.length) {
				int[] array2 = new int[array.length * 2];
				for (int i = 0; i < array.length; i++)
					array2[i] = array[i];
				array = array2;
			}
			array[virtualSize] = v;
			int currentIndex = virtualSize;
			virtualSize++;
			while (currentIndex != 0 && array[currentIndex] < array[getParent(currentIndex)]) {
				int temp = array[getParent(currentIndex)];
				array[getParent(currentIndex)] = array[currentIndex];
				array[currentIndex] = temp;
				currentIndex = getParent(currentIndex);
			}
		}
	}

	public int min() {
		int tempMin = Integer.MAX_VALUE;
		for (int i = 0; i < virtualSize; i++) {
			if (array[i] < tempMin)
				tempMin = array[i];
		}
		return tempMin;
	}

	public int ExtractMin() {
		int min = min();
		array[0] = 0;
		int tempIndex = 0;
		while (tempIndex + 1 < virtualSize) {
			array[tempIndex] = array[tempIndex + 1];
			tempIndex += 1;
		}
		array[tempIndex] = 0;
		virtualSize -= 1;
		return min;
	}

	public int size() {
		return virtualSize;
	}

	public String toString() {
		int i = 1;
		int j = 1;
		while (i < virtualSize) {
			i = 2;
			j++;
		}
		String s = "" + j;
		s += "[";
		s += "]";
		return s;
	}
}
