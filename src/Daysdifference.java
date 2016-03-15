import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Daysdifference {
	public static void main(String[] args) throws ParseException {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a Date string");
		String dateString1 = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter a Date string");
		String dateString2 = sc2.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse(dateString1);
		Date d2 = sdf.parse(dateString2);
		long diff = d2.getTime() - d1.getTime();
		System.out.println("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		System.out.println(diff);
	}
}
