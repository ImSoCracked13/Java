import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = new int[] {10, 4, -6, 9, 8, 2};
		System.out.println("arr[]  = " + Arrays.toString(arr));
		//C1
		reverse(arr);
		reverse(arr);
		//C2
		int[] brr = reverseV2(arr);
		arr = brr;
		
		System.out.println("arr[]  = " + Arrays.toString(arr));	
	}

	private static int[] reverseV2(int[] arr) { //a pure function
		int n = arr.length;
		int[] temp = new int[n];
		for(int i=0; i<n; i++) {  
			temp[n-1-i] = arr[i];
		}
		return temp;
	}

	private static void reverse(int[] arr) {
		//int[] brr = Arrays.copyOf(arr, arr.length);
		int n = arr.length;
		for(int i=0; i<n/2; i++) {  //repeat n/2 times		
			int temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
	}
}
