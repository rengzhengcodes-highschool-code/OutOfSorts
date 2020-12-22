import java.util.Random;
import java.util.Arrays;

public class InsertionTester {
	private static boolean DEBUG = false;

	public static void main(String[] args) {

		manualEvaluation();

		boolean failure = false;
		//failure = seededRandomSort(1000, 1000);
		//failure = seededRandomSort(10, 1) || failure;
		//failure = seededRandomSort(10, 0) || failure;
		//failure = seededRandomSort(10, 2) || failure;

		TesterMethods.overall(failure);
	}

	public static void manualEvaluation() {
		TesterMethods.tester("expectedPrints EXPECTS YOU TO PRINT PER SORT CYCLE");
		Sorts.main(new String[1]);

		int[][] sorts = {
			{4, 3, 2, 10, 12, 1, 5, 6},
			{2, 3, 4, 5, 1},
			{6, 1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5},
			{},
			{0},
			{5, 4, 3, 2, 1},
		};

		int[][][] expectedPrints = {
			{
				{4, 3, 2, 10, 12, 1, 5, 6},
				{3, 4, 2, 10, 12, 1, 5, 6},
				{2, 3, 4, 10, 12, 1, 5, 6},
				{2, 3, 4, 10, 12, 1, 5, 6},
				{1, 2, 3, 4, 10, 12, 5, 6},
				{1, 2, 3, 4, 5, 10, 12, 6},
				{1, 2, 3, 4, 5, 6, 10, 12},
			},
			{
				{}
			},
			{
				{}
			},
			{
				{}
			},
			{
				{}
			},
			{
				{}
			},
			{
				{}
			},
		};

		for (int test = 0; test < sorts.length; test++) {
			System.out.println("insertionPrint");
			Sorts.insertionSort(sorts[test]);

			System.out.println("expectedPrints");
			for (int line = 0; line < expectedPrints[test].length; line++) {
				System.out.println(Arrays.toString(expectedPrints[test][line]));
			}

		}
		System.out.println("expectedPrints EVALUATE YOURSELF");
	}

	public static boolean seededRandomSort(int tests, int arrLen) {
		TesterMethods.tester("seededRandomSort");
		boolean fail = false;

		for (int test = 0; test < tests; test++) {
			Random rng = new Random(test);
			int[] sort = new int[arrLen];
			int[] expected = new int[arrLen];

			for (int i = 0; i < arrLen; i++) {
				int val = rng.nextInt(arrLen) - arrLen / 2;
				sort[i] = val;
				expected[i] = val;
			}

			if (DEBUG) {
				System.out.println(Arrays.toString(sort));
				System.out.println(Arrays.toString(expected));
			}

			Sorts.insertionSort(sort);
			Arrays.sort(expected);

			if (DEBUG) {
				System.out.println(Arrays.toString(sort));
				System.out.println(Arrays.toString(expected));
			}

			if (Arrays.equals(sort, expected)) {
				if (DEBUG) {
					TesterMethods.passMessage(test);
				}
			} else {
				fail = true;
				TesterMethods.errorMessage(test, Arrays.toString(expected), Arrays.toString(sort));
			}
		}

		TesterMethods.methodMessage("seededRandomSort", fail);
		return fail;
	}
}
