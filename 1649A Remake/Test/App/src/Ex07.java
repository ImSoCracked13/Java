public class Ex07 {
    // Given a sorted list and a new value, write a program to insert the value at the correct position.
    public static void main(String[] args) {
        int[] originalSortedArray = {1, 2, 3, 4, 5};
        int newValue = 3;
        int[] newSortedArray = insertIntoSortedArray(originalSortedArray, newValue);
        for (int number = 0; number < newSortedArray.length; number++) {
            System.out.print(newSortedArray[number] + " ");
        }
    }

    public static int[] insertIntoSortedArray(int[] originalSortedArray, int newValue) {
        int[] newSortedArray = new int[originalSortedArray.length + 1];
        int i = 0;

        // Use a for loop to find the correct position to insert the new value
        for (i = 0; i < originalSortedArray.length && originalSortedArray[i] < newValue; i++) {
            newSortedArray[i] = originalSortedArray[i];
        }

        // Insert the new value
        newSortedArray[i] = newValue;

        // Copy the remaining elements
        for (int j = i; j < originalSortedArray.length; j++) {
            newSortedArray[j + 1] = originalSortedArray[j];
        }

        return newSortedArray;
    }
}