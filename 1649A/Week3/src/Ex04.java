
public class Ex04 {
	public static void main(String[] args) {
		// sum = 1 + 2 + 3 + ... + n
		int n = 50;
		
		//C1: Apply Gauss's summation 
		int sum = n*(n+1)/2;
		System.out.println("Sum = " + sum);
		
		//C2: Iteration approach
		sum = tinh(n);
		System.out.println("Sum = " + sum);
		// sum of all elements in arr[]
		int[] arr = new int[] {10, 4, -6, 9, 8, 2};
		int sumArr = tinhArray(arr);
		System.out.println("SumArr = " + sumArr);
		
		//C3: Recursion approach
		sum = tinhRecur(n);
		System.out.println("Sum = " + sum);
		
		sumArr = tinhArrayRecur(arr, arr.length-1);
		System.out.println("SumArr = " + sumArr);
	}

	private static int tinhArrayRecur(int[] arr, int end) {
		if(end==0)
			return arr[0];
		else
			return tinhArrayRecur(arr, end-1) + arr[end];
	}

	private static int tinhRecur(int n) {     //recursive function
		if(n==1)
			return 1;
		else
			return tinhRecur(n-1) + n;
	}

	private static int tinhArray(int[] arr) { //an iterative function
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result = result + arr[i];
		}
		return result;
	}

	private static int tinh(int n) { //iterative function
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
