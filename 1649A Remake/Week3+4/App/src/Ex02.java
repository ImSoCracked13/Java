import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        // Partition
        int[] arr = {-10, 2, 5, -7, 11, 4};
        int threshold = 0;
        System.out.println("arr[] = " + Arrays.toString(arr));

        //Process: left: elements<threshold, right: elements>=threshold
        //1: Create a temporary array to store the partitioned elements
        int[] temp = new int[arr.length];
        int leftIndex = 0; // Index for left partition
        int rightIndex = arr.length - 1; // Index for right partition
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < threshold) {
                temp[leftIndex] = arr[i]; // Place in left partition
                leftIndex++; // Move to next position in left partition
            } else {
                temp[rightIndex--] = arr[i]; // Place in right partition
            }
        }

        int count = 0; // Count of elements in the left partition
        // 2: Fill the temporary array with the partitioned elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < threshold) {
                temp[count++] = arr[i]; // Fill left partition
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= threshold) {
                temp[count++] = arr[i]; // Fill right partition
            }
        }

        // In case:
        for(int i=0; i < arr.length; i++) {
            arr[i] = temp[i]; // Shift right partition elements to the end
        }

        // ** Update new positions in the temporary array
        // arr = temp;
        // Example modification to the temporary array
        // temp[0] = 77; 

        arr = temp; // Assign the partitioned array back to arr
        System.out.println("Partitioned arr[] = " + Arrays.toString(arr)); // Print the partitioned array
        // Print the temporary array to see the partitioned elements
        System.out.println("temp[] = " + Arrays.toString(temp));
    }
}
