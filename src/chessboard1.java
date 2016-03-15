
public class chessboard1 {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 8; j++) {
				printchessboard(i, j);
			}

			System.out.println();
		}
	}

	public static void printchessboard(int row, int column) {
		String Start = "B";
		String Next = "W";

		if (row % 2 == 0) {
			Start = "W";
			Next = "B";

		}
		if (column % 2 == 0) {
			System.out.print(Start + "");
		} else
			System.out.print(Next + "");

	}

}
