package Task_1;

import java.util.Arrays;

public class Task_3 {

	// sort by descending order
	public static void insertionSort(int[] array) {
		// TODO

		for (int i = 0; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] < key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] array = { 23, 45, 57, 89, 62 };
		insertionSort(array);
		System.out.println("Mang sap xep dam dan : ");
		System.out.print(Arrays.toString(array));
	}
}
