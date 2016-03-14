
public class mergesort1 {

	public static int[] merge_sort(int[] a) {
		if (a.length <= 1) {
			return a;
		}

		int midpoint = a.length / 2;

		int[] left = new int[midpoint];

		int[] right;

		if (a.length % 2 == 0) {
			right = new int[midpoint];
		} else {
			right = new int[midpoint + 1];
		}

		int[] result = new int[a.length];

		for (int i = 0; i < midpoint; i++) {
			left[i] = a[i];
		}

		int x = 0;

		for (int j = midpoint; j < a.length; j++) {
			if (x < right.length) {
				right[x] = a[j];
				x++;
			}
		}

		left = merge_sort(left);
		right = merge_sort(right);
		result = merge(left, right);
		printnumbers(left);
		return result;

	}

	public static int[] merge(int[] left, int[] right) {

		int lengthresult = left.length + right.length;
		int[] result = new int[lengthresult];
		int indexL = 0;
		int indexR = 0;
		int indexres = 0;

		while (indexL < left.length || indexR < right.length) {
			if (indexL < left.length && indexR < right.length) {
						if (left[indexL] <= right[indexR]) {
							result[indexres] = left[indexL];
							indexL++;
							indexres++;
		
						} else {
							result[indexres] = right[indexR];
							indexR++;
							indexres++;
						}
				// if the rightside  has no  elemnts
			} else if (indexL < left.length) {
				result[indexres] = left[indexL];
				indexL++;
				indexres++;
				
				//if the leftside has no elements
			} else if (indexR < right.length) {
				result[indexres] = right[indexR];
				indexR++;
				indexres++;
			}

		}
		return result;

	}

	public static void printnumbers(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {

		int input[] = { 4, 2, 7, 1, 3, 10, -9 };

		input = merge_sort(input);
		printnumbers(input);
	}

}
