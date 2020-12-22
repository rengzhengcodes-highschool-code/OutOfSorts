import java.util.Arrays;

public class Sorts{

	public static boolean DEBUG = true;

  public static void dprint(String s){
    if(DEBUG) {
      System.out.println(s);
    }
  }

	public static void main(String[]args){
    //do this so you do not forget to turn it off
    dprint("TURN THIS OFF BEFORE SUBMITTING YOUR CODE!!!!!!!!");

    //Add the other parts of your main

  }

  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data) {
		boolean sorted = false;

		int pass = 0;
		while (!sorted) {
			dprint(Arrays.toString(data));

			boolean swapped = false;
			for (int i = 0; i < (data.length - 1) - pass; i++) {
				if (data[i] > data[i+1]) {
					swapped = true;
					int holder = data[i];
					data[i] = data[i+1];
					data[i+1] = holder;
				}
			}

			if (!swapped) {
				sorted = true;
			}
			pass++;
		}

	}

	public static void selectionSort(int[] data) {
		for (int run = 0; run < data.length; run++) {
			dprint(Arrays.toString(data));
			int min = data[run];
			int minIndex = run;

			for (int comparison = run; comparison < data.length; comparison++) {
				if (min > data[comparison]) {
					min = data[comparison];
					minIndex = comparison;
				}
			}

			data[minIndex] = data[run];
			data[run] = min;
		}

	}

	public static void insertionSort(int[] data) {
		dprint(Arrays.toString(data));

		for (int index = 1; index < data.length; index++) {

			int comparisonPosition = index-1;
			int value = data[index];

			while (comparisonPosition >= 0 && data[comparisonPosition] > value) {
				data[comparisonPosition+1] = data[comparisonPosition];//shifts previous position up if value is not supposed to go in this current position, as that means the value that was shifted to the previous value is larger than here so it must be inserted before this index.
				comparisonPosition--;
			}

			data[comparisonPosition+1] = value;//+1 necessary as insertion position overshoots where it's supposed to terminate due to the way it evaluates and shifts.

			dprint(Arrays.toString(data));
		}

	}

}
