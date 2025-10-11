public class Ex04 {
    // Find maximum in an array using recursion.
    public static void main(String[] args) {
        int[] arr = {4, -6, 9, 2, 13, 7, -11, 1};

        int maxIteration = findMaxIteration(arr);
        System.out.println("The maximum value in the array (using iteration) is: " + maxIteration);

        int maxRecursion = findMaxRecursion(arr, 0, arr.length - 1);
        System.out.println("The maximum value in the array (using recursion) is: " + maxRecursion);
    }

    // 1. Iteration to find the maximum value in an array.
    public static int findMaxIteration(int[] arr) {
        int maxIteration = Integer.MIN_VALUE; // Initialize max to the smallest possible integer
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxIteration) {
                maxIteration = arr[i]; // Update max if current element is greater
            }
        }
        return maxIteration; // Return the maximum value found
    }

    // 2. Recursion to find the maximum value in an array.
    public static int findMaxRecursion(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start]; // Base case: only one element
        }
        else {
            int x = findMaxRecursion(arr, start, end - 1); // Recursive call to the next element
            return (arr[end] > x) ? arr[end] : x; // Compare current element with the maximum of the rest
        }
    }
}
