import java.util.Scanner;

public class TakingUserInput1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter byte value : ");

		byte a = scan.nextByte();

		System.out.println(a);

		System.out.println("Enter integer value : ");

		int b = scan.nextInt();

		System.out.println(b);
		scan.close();
	}

}