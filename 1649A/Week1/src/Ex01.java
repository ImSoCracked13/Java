import java.util.Scanner;

public class Ex01 {
	// Naming conventions
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// int x = 2147483647 + 3;
		long x = (long) 55555 * 80000;
		System.out.print("Enter a & b = ");
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		int a = 13;
		int b = 5;
		double y = (double) a / b; // 2.6

		System.out.println("x = " + x);
		System.out.println("y = " + y);

		double z = 0.7;
		if (true) 
			System.out.println("Yes");
		else {
			System.out.println("No");
			System.out.println("Hello");
		}
		// (z == 0.7f) is an expression / a condition
		// an expression returns true/false

	}

}
