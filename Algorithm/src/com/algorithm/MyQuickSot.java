package com.algorithm;

public class MyQuickSot {
	private int array[];
	private int length;

	private void quickSort(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}
		this.array = array;
		length = array.length;
		sort(0, length - 1);

	}

	private void sort(int loweIndex, int higherIndex) {
		int i = loweIndex;
		int j = higherIndex;
		int pivot = array[loweIndex + (higherIndex - loweIndex) / 2];
		while (i <= j) {
			while (array[i] < pivot) {
				i++;

			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}
		if (loweIndex < j)
			sort(loweIndex, j);
		if (i < higherIndex) {
			sort(i, higherIndex);
		}

	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		int[] input = { 20, 35, 12, 10, 7, 55, 1, 0 };
		MyQuickSot sort = new MyQuickSot();
		sort.quickSort(input);

		for (int i : input) {
			System.out.print(i + ",");
		}
		System.out.println("\n");

	}

}
