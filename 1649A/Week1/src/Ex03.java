import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int max = Integer.MIN_VALUE;
		int i=0;
		for(; i<n;) {
			int temp = sc.nextInt();
			if(max < temp)
				max = temp;
			i++;
		}
		System.out.println("Maximum value is: " + max);
	}
}
