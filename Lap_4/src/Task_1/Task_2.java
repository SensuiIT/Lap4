package Task_1;

import java.util.Arrays;

public class Task_2 {

	// sort by descending order
	public static void bubbleSort(int[] array) {
		// TODO
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					// swap
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 7, 9, 2, 5, 9, 0, 3 };
		bubbleSort(array);
		System.out.println("Mang sap xep giam dam : ");
		System.out.print(Arrays.toString(array));

	}
}
