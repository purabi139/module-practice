
public class bubblesort1 {

	// sort the array { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
	// // logic to sort the elements
	public static int[] bubblesort(int array[]) {

		int n = array.length;

		for (int m = n; m >= 0; m--) {
			int k;
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				// System.out.println("i"+array[i] + " k "+ array[k]);
				if (array[i] > array[k]) {
					swap(i, k, array);
				}
			}
		}
		return array;

	}

	public static void swap(int i, int k, int[] array) {
		int temp;
		temp = array[i];
		array[i] = array[k];
		array[k] = temp;

	}

	public static void print(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int input[] = { 3, -9, 0, 8, 5, 2 };
		int[] output = bubblesort(input);

		print(output);
	}

}
