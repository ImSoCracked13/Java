public class Ex05 {
    public static void main(String[] args) {
        int count = 0; // Initialize count to 0
        long n = 64; // Example input for the number of iterations
        // for (long i = 0; i < n; i++) {
        //     count++; // Increment count for each iteration
        // }
        for (long i = 0; i < Math.pow(2, n); i++) {
            count++; // Increment count for each iteration
        }

        // The counter variable i runs from 0 to n-1 with incremental steps of 1.
        // The loop runs n times.
        // Each interation of the loop performms a single operation (incrementing count).
        // - 1 assignment operation to initialize count to 0.
        // - 1 addition operation to increment count in each iteration.

        // This has a linear time complexity of O(n) because the loop iterates n times, performing a constant amount of work in each iteration.
        System.out.println("The count after " + n + " iterations is: " + count); 
    }
}
