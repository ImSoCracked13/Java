import java.util.Arrays;

public class Ex12 {
    // Write a program to reverse an array in place (without using another array).
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i]; // Temporary variable to store the value of the current element
            array[i] = array[array.length - i - 1]; // Swap the current element with the element at the opposite index
            array[array.length - i - 1] = temp; // Swap the current element with the element at the opposite index
        }
    }
}
