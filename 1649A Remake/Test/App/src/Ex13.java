public class Ex13 {
    // Write a program to count the frequency of each element in an integer array.
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 3, 2, 3};
        countFrequencies(array);
    }

    public static void countFrequencies(int[] array) {
        boolean[] visited = new boolean[array.length]; // Track visited elements

        for (int i = 0; i < array.length; i++) {
            if (visited[i]) {
                continue; // Skip this element if already counted
            }

            int count = 1; // Start counting from 1 for the current element
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    visited[j] = true; // Mark as visited
                    count++;
                }
            }

            // Display the frequency of the current element
            System.out.println(array[i] + " occurs " + count + " times");
        }
    }
}
