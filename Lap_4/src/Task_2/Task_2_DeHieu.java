package Task_2;

import java.util.Arrays;
import java.util.Iterator;

public class Task_2_DeHieu {

	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int index = recursive(arr, low, high);
			quickSort(arr, low, index - 1);
			quickSort(arr, index + 1, high);
		}
	}

	private static int recursive(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = arr[high];
		int i = low -1;
		
		for (int j = low; j < high; j++) {
			if(arr[j] <= pivot) {
				i++;
				
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
//	public static void printArray(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
//		System.out.println();
//	}
	public static void main(String[] args) {
		int[] arr = {1,2,4,46,8,9};
		quickSort(arr, 0, 5 );
		System.out.println(Arrays.toString(arr));
	}
}
