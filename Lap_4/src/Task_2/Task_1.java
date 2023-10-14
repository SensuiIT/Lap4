package Task_2;

import java.util.Arrays;

public class Task_1 {

		public static void mergeSort(int[] array) {
		    if (array == null || array.length <= 1) {
		        return; // Already sorted or nothing to sort
		    }

		    int middle = array.length / 2;

		    // Split the array into two halves
		    int[] leftHalf = new int[middle];
		    int[] rightHalf = new int[array.length - middle];

		    for (int i = 0; i < middle; i++) {
		        leftHalf[i] = array[i];
		    }

		    for (int i = middle; i < array.length; i++) {
		        rightHalf[i - middle] = array[i];
		    }

		    // Recursively sort the two halves
		    mergeSort(leftHalf);
		    mergeSort(rightHalf);

		    // Merge the sorted halves
		    merge(array, leftHalf, rightHalf);
		}

		public static void merge(int[] array, int[] left, int[] right) {
		    int i = 0, j = 0, k = 0;

		    while (i < left.length && j < right.length) {
		        if (left[i] > right[j]) {
		            array[k] = left[i];
		            i++;
		        } else {
		            array[k] = right[j];
		            j++;
		        }
		        k++;
		    }

		    while (i < left.length) {
		        array[k] = left[i];
		        i++;
		        k++;
		    }

		    while (j < right.length) {
		        array[k] = right[j];
		        j++;
		        k++;
		    }
		}
		public static void main(String[] args) {
			int[] array = {1,3,6,8,9,2};
			mergeSort(array);
			System.out.print(Arrays.toString(array));
		}
}
