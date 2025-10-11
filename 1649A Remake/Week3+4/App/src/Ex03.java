import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] arr = {16, 20, 13, -4, 15, -8, 16, 4};
        int threshold = 0;
        System.out.println("arr[] = " + Arrays.toString(arr));

        // Partition: move all elements < threshold to the left
        int leftIndex = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < threshold) {
                int temp = arr[i];
                arr[i] = arr[leftIndex];
                arr[leftIndex] = temp;
                leftIndex++;
            }
        }

        System.out.println("Partitioned arr[] = " + Arrays.toString(arr));
    }
}
