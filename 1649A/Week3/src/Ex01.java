
public class Ex01 {
	// Function: Re-use the piece of codes (effectively) in different contexts
	public static void main(String[] args) {
		int[] arr = {10, 2, -5, 6, 0, 8, 1, 12, 4, 6, 1};
		
		int max = findMax(arr);//a function call
		// While calling a function, we provide the function's arguments
		//an argument: a particular value passed to a function's parameter
		System.out.println("Maximum value of 'arr' is: " + max);
			
		int[] brr = {2, 1, 0, -2, -5, -6, 9, 2, 4};
		max = findMax(brr);
		System.out.println("Maximum value of 'brr' is: " + max);
	}
	//Definition & Implementation of a function
	// 3 main components in the definition of a function
	/*
	 	1/ Function's name: findMax()
	 		The findMax() operation should...
	 		The 'findMax' operation should...
	 		
	 		Proper names: findMax(), find_max(), FindMax(), registerCourse()
	 		Improper names: maximum(), registercourse(), 19FindMax(), iLoveYou()
	 	2/ List of parameter(s): Input(s) of a function 
	 	3/ Return type: Data type of the expected output
	 */
	private static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max; //actual output / returned value
	}
}
