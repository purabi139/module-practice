
public class Chessboard {

	public static void main(String[] args) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				printchess(i, j);
			}

			System.out.println();
		}

	}

	private static void printchess(int row, int column) {
		String start = "W";
		String next = "B";

		if (column % 2 == 0) {
			start = "B";
			next = "W";
		}
		if (row % 2 == 0) {
			System.out.print(start + " ");
		}

		else {
			System.out.print(next + " ");
		}
	}

}

/*
 * ********
 ********
 ********
 ********
 ********
 ********
 ********
 */