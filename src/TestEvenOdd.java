import java.util.Scanner;

public class TestEvenOdd {
	// testing even or odd without using modulo operator
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int result = num;
		while (result >= 2) {
			result = result - 2;
		}
		if (result == 1) {
			System.out.println("it is odd" + num);
		} else {
			System.out.println("it is even" + num);
		}
	}
}
