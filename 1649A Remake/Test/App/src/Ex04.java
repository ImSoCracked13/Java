public class Ex04 {
    // Given an array of integers (possibly with duplicates), write a program to find the second largest element.
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second largest element is: " + secondLargest);
    }
    // Find the second largest element
    public static int findSecondLargest(int[] numbers) {
        int largest = numbers[0];
        int secondLargest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest; // Update the second largest element
                largest = numbers[i]; // Update the largest element
            }
        }
        return secondLargest;
    }
}
