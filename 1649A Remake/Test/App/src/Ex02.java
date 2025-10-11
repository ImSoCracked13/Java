import java.util.Arrays;

public class Ex02 {
    // Write a program to delete an element at a specific position in an array.
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int position = 2;
        deleteElement(numbers, position);
        System.out.println("The array after deleting the element at position " + position + " is: " + Arrays.toString(numbers));
    }
    // Delete the element at the specific position
    public static void deleteElement(int[] numbers, int position) {
        for (int i = position; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1]; // Shift the elements to the left by 1
        }
        numbers[numbers.length - 1] = 0; // Set the last element to 0 after shifting
    }
}
