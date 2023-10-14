package Task_1;

import java.util.Arrays;


public class Task_1 {

	// sort by descending order
	public static void selectionSort(int[] array) {
		// TODO

		for (int i = 0; i < array.length - 1; i++) {
			int max = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[max]) {
					max = j;
				}
			}
			// swap
			int temp = array[i];
			array[i] = array[max];
			array[max] = temp;
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 6, 8, 5, 9, 6, 3 }; 
		selectionSort(array);
		System.out.println("Mang sap xep dam dan : ");
		System.out.print(Arrays.toString(array));
	}
}