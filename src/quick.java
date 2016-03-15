
public class quick {
	// 5, 1, 6, 2, 4, 3

	public static int partition(int lowerBound, int upperBound, int a[]) {
		int x = a[upperBound];
		int i = lowerBound - 1;
		for (int j = lowerBound; j < upperBound; j++) {
			if (a[j] <= x) {
				i = i + 1;
				swap(i, j, a);
			}
		}
		swap(i + 1, upperBound, a);
		return i + 1;

	}

	public static void doquicksort(int lowerBound, int upperBound, int a[]) {
		if (lowerBound < upperBound) {
			int pivot = partition(lowerBound, upperBound, a);
			doquicksort(lowerBound, pivot - 1, a);
			doquicksort(pivot + 1, upperBound, a);

		}
	}

	public static void printnumbers(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
		System.out.println("\n");
	}

	public static void swap(int i, int j, int a[]) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {

		int input[] = { 10, 0, -7, 6, 3 - 4, 8 };
		doquicksort(0, input.length - 1, input);
		printnumbers(input);

	}

}
