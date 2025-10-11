public class Ex01 {
    // Write a program to find the smallest odd number in an array.
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9}; // Example array
        int smallestOdd = findSmallestOdd(numbers);
        
        if (smallestOdd == Integer.MAX_VALUE) {
            System.out.println("No odd number found in the array.");
        } else {
            System.out.println("The smallest odd number is: " + smallestOdd);
        }
    }

    // Find the smallest odd number in the array
    public static int findSmallestOdd(int[] numbers) {
        int smallestOdd = Integer.MAX_VALUE; // Initialize with a large value

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 && numbers[i] < smallestOdd) {
                smallestOdd = numbers[i];
            }
        }
        return smallestOdd;
    }
}