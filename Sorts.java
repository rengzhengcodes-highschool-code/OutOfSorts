public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data) {
		boolean sorted = false;

		while (!sorted) {

			for (int i = 0; i < (data.length - 1) - i; i++) {
				if (data[i] < data[i+1]) {
					int holder = data[i];
					data[i] = data[i+1];
					data[i+1] = holder;
				}
			}

		}

	}

}
