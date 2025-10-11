public class Ex06 {
    // Write a program to check whether an array is sorted. If it is, state whether it is in ascending or descending order.
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean isSorted = isSorted(numbers);
        System.out.println("The array is sorted: " + isSorted);
    }
    // Check if the array is sorted
    public static boolean isSorted(int[] numbers) {
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
            }
            if (numbers[i] < numbers[i + 1]) {
                isDescending = false;
            }
        }
        if (isAscending) {
            System.out.println("The array is sorted in ascending order.");
            return true;
        } else if (isDescending) {
            System.out.println("The array is sorted in descending order.");
            return true;
        } else {
            System.out.println("The array is not sorted.");
            return false;
        }
    }
}
