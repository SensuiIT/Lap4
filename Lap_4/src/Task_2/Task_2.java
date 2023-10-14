package Task_2;
	import java.util.Arrays;
	import java.util.Random;

	public class Task_2 {
	    public static void quickSort(int[] array) {
	        if (array == null || array.length <= 1) {
	            return;
	        }
	        quickSort(array, 0, array.length - 1);
	    }

	    private static void quickSort(int[] array, int low, int high) {
	        if (low < high) {

	            int pivot = getPivot_MedianOfThree(array, low, high);
	            
	            int pivotIndex = partition(array, low, high, pivot);
	            
	            quickSort(array, low, pivotIndex - 1);
	            quickSort(array, pivotIndex + 1, high);
	        }
	    }

	    private static int partition(int[] array, int low, int high, int pivot) {
	        int pivotValue = array[pivot];
	        swap(array, pivot, high);
	        int i = low;
	        for (int j = low; j < high; j++) {
	            if (array[j] <= pivotValue) {
	                swap(array, i, j);
	                i++;
	            }
	        }
	        swap(array, i, high);
	        return i;
	    }

	    private static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }

	    private static int getPivot_MedianOfThree(int[] array, int low, int high) {
	        int mid = (low + high) / 2;
	        if ((array[low] <= array[mid] && array[mid] <= array[high]) || (array[high] <= array[mid] && array[mid] <= array[low])) {
	            return mid;
	        } else if ((array[mid] <= array[low] && array[low] <= array[high]) || (array[high] <= array[low] && array[low] <= array[mid])) {
	            return low;
	        } else {
	            return high;
	        }
	    }

	    private static int getPivot_First(int[] array, int low, int high) {
	        return low;
	    }

	    private static int getPivot_Last(int[] array, int low, int high) {
	        return high;
	    }

	    private static int getPivot_Random(int[] array, int low, int high) {
	        Random rand = new Random();
	        return rand.nextInt(high - low + 1) + low;
	    }
	    public static void main(String[] args) {
			int[] array = {1,3,55,7,84,32};
			quickSort(array);
			System.out.print(Arrays.toString(array));
		}
	}
