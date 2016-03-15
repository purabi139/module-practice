
public class Quicksort {

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

	public static void quicksort(int p, int r, int a[]) {
		if (p < r) {
			int pivot = partition(p, r, a);
			quicksort(p, pivot - 1, a);
			quicksort(pivot + 1, r, a);
		}
	}

	public static void swap(int i, int j, int a[]) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void printnumbers(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int input[] = { 5, 1, 6, 2, 4, 3 };
		quicksort(0, input.length - 1, input);
		printnumbers(input);
	}

}
