public class Ex02 {
    public static void main(String[] arg) throws Exception {
        // Iteration (bottom-up approach) vs Recursion (top-down approach)

        // Recursion is a function that calls itself to solve a problem.
        // Recursion is also top-down approach, where the problem is solved by breaking it down into smaller subproblems until a base case is reached.
        int n = 99; // Example input


        // Time Complexity Analysis:
        // 0(1) Complexity: The constant time complexity is not applicable in this case, as both methods involve a linear traversal through the numbers from 1 to n, resulting in O(n) time complexity. 
        // 0(n) Complexity: The time complexity of both iteration and recursion for calculating the sum of the first n natural numbers is O(n), as both methods involve a linear traversal through the numbers from 1 to n.
        // 0(n^2) Complexity: The space complexity of the recursive approach is O(n) due to the call stack, while the iterative approach has O(1) space complexity since it uses a constant amount of space regardless of the input size.
        // 0(log n) Complexity: The logarithmic complexity is not applicable in this case, as both methods involve a linear traversal through the numbers from 1 to n, resulting in O(n) time complexity.
        // 0(n log n) Complexity: The sum of the first n natural numbers does not involve any logarithmic operations, so the complexity remains O(n) for both methods.
        // 0(2^n) Complexity: The exponential complexity is not applicable in this case, as both methods involve a linear traversal through the numbers from 1 to n, resulting in O(n) time complexity.
        // 0(n!) Complexity: The factorial complexity is not applicable in this case, as both methods involve a linear traversal through the numbers from 1 to n, resulting in O(n) time complexity.


        // Gaussian's Sum Formula: The sum of the first n natural numbers can be calculated using the formula n(n + 1) / 2.
        int sumFormula = n * (n + 1) / 2;
        System.out.println("The sum of numbers from 1 to " + n + " using Gaussian's formula is: " + sumFormula);


        // C0 requires 4 operations:
        // 1. Multiplication: n * (n + 1)
        // 2. Addition: n + 1
        // 3. Division: (n * (n + 1)) / 2



        // 1.Iteration (bottom-up approach)
        int iterativeSum = iterativeCalculate(n);
        System.out.println("The sum of numbers from 1 to " + n + " using iteration is: " + iterativeSum);


        // 2. Recursion (top-down approach)
        int recursiveSum = recursiveCalculate(n);
        System.out.println("The sum of numbers from 1 to " + n + " using recursion is: " + recursiveSum);
    }


    private static int iterativeCalculate(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add each number from 1 to n
        }
        return sum; // Return the total sum
    }


    // Explain with time complexity:
    // sum = 0; // 1 step: 1 assignment
    // i = 1; // 1 step: 1 assignment
    // i <= n; // (n+1) steps: n comparisons + 1 comparison for the last iteration
    // i++ // n steps: n increments + n additions
    // return sum; // 1 step: 1 return statement
    

    // Example: T(n) = 3n + 3
    // C1 has a linear time complexity of O(n) because the number of operations grows linearly with the input size n.


    private static int recursiveCalculate(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: return n plus the sum of numbers from 1 to n-1
        return n + recursiveCalculate(n - 1);
    }
}

