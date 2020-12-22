import java.util.Arrays;

public class Sorts{

	public static boolean DEBUG = true;

  public static void dprint(String s){
    if(DEBUG){
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

			int start = data[run];
			int min = data[run];
			int minIndex = run;

			for (int index = run; index < data.length; index++) {
				if (min > data[index]) {
					min = data[index];
					run = index;
				}
			}

			data[run] = min;
			data[minIndex] = start;
		}

	}

	public static void insertionSort(int[] data) {
		for (int index = 1; index < data.length; index++) {
			int insertionPosition = index;
			int value = data[index];

			while (data[insertionPosition-1] > value && insertionPosition > 1) {
				data[insertionPosition] = data[insertionPosition-1];
				insertionPosition--;
			}

			data[insertionPosition] = value;

			dprint(Arrays.toString(data));
		}
	}

}
