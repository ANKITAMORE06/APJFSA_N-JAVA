package core_java;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a 3-digit number:");
		int num = scanner.nextInt();

		int rev = 0;

		while (num!=0) {
			int rem = num % 10;
			rev = rev*10+rem;
			num =num/10;

		}
		System.out.println("rev num:" +rev);

}
}