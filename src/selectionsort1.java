
public class selectionsort1 {

	public static int[] doselectionsort(int[] array) {
		// this for loops takes a base elemnt scans with each element of array
		for (int i = 0; i <= array.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			int smallerNumber = array[index];
			array[index] = array[i];
			array[i] = smallerNumber;
		}
		return array;

	}

	public static int[] printarray(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i] + " ,");

		}

		return input;

	}

	public static void main(String[] args) {
		int input[] = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		int[] output = doselectionsort(input);
		doselectionsort(output);

	}

}
