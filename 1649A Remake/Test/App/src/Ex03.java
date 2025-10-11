import java.util.Arrays;

public class Ex03 {
    // Implement the easiest sorting algorithm: Bubble Sort
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};
        bubbleSort(numbers);
        System.out.println("The sorted array is: " + Arrays.toString(numbers));
    }
    // Bubble Sort
    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) { // Loop through the array
            for (int j = 0; j < numbers.length - i - 1; j++) { // Loop through the array
                if (numbers[j] > numbers[j + 1]) { // If the current element is greater than the next element
                    int temp = numbers[j]; // Temporary variable to store the value of the current element
                    numbers[j] = numbers[j + 1]; // Swap the current element with the next element
                    numbers[j + 1] = temp; // Swap the current element with the next element
                }
            }
        }
    }
}
