import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a, b, & c: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		//int max = (a>b) ? a : b;
//		int max = 0;
//		if(a >= b  && a >= c)
//			max = a;
//		else if(b>=a && b>=c)
//			max = b;
//		else
//			max = c;
		
		int max = Integer.MIN_VALUE;
		if(max < a)
			max = a;
		if(max < b)
			max = b;
		if(max < c)
			max = c;
		
		System.out.println("Maximum value is: " + max);
		

	}

}
