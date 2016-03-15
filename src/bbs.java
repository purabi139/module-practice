
public class bbs {

	public static int[] bs(int[] array) {

		/*
		 * for(int i=0; i<array.length; i++) { for(int j=0; j<array.length-i-1;
		 * j++) { if( array[j] > array[j+1]) { swap(i,j,array); } } }
		 */
		int n = array.length;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap(j, j + 1, array);
				}
			}
		}
		return array;

	}

	public static void swap(int i, int j, int[] array) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void printnumbers(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {

		int input[] = { 5, -7, -1, 2, 0, 78, -67 };
		int[] output = bs(input);
		printnumbers(output);

	}

}
