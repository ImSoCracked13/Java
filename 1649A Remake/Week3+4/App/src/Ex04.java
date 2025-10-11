import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[] arr = new int[10]; // Initialize an array of size 10
        int range = 10; // Define the range for random numbers
        // 1. Create random increasing array
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = (int) (Math.random() * range); // Fill first element with a random number from 0 to 99
            } else {
                arr[i] = arr[i - 1] + (int) (Math.random() * range); // Ensure increasing order by adding a random number
            }
            // System.out.println("arr[] = " + Arrays.toString(arr)); // This line can be commented out to avoid printing the array after each addition
        }
        System.out.println("Increasing arr[] = " + Arrays.toString(arr)); // Corrected to print the final array after all elements are added

        

        // 2. Create random decreasing array with temp array
        // int[] temp = new int[arr.length]; // Initialize a temporary array of size 10
        // for (int i = 0; i < arr.length; i++) {
        //     temp[i] = arr[arr.length - 1 - i]; // Fill the temporary array with elements from the original array in reverse order
        // }
        // arr = temp; // Assign the temporary array back to arr
        // System.out.println("Decreasing arr[] = " + Arrays.toString(arr)); // Print the decreasing array

        // 3. Swap elements in the array
        int n = arr.length; // Get the length of the array
        int temp2;
        for(int i = 0; i < (n-1) / 2; i++) {
            temp2 = arr[i]; // Store the current element in a temporary variable
            arr[i] = arr[n - 1 - i]; // Swap the current element with its counterpart from the end of the array
            arr[n - 1 - i] = temp2; // Assign the value from the temporary variable to the counterpart
            System.out.println("Swapped arr[] = " + Arrays.toString(arr)); // Print the array after swapping elements
        }
        System.out.println("Swapped arr[] = " + Arrays.toString(arr)); // Print the array after swapping elements
    }
}
    