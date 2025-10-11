public class Test01 {
    // 1. Why do we need functions?
    // Functions (methods) help us organize code, avoid repetition, and make code reusable and easier to understand.

    // 2. Define a function and its main components: name, parameters, return type
    // This function adds two integers and returns the result.
    public static int add(int a, int b) { // name: add, parameters: int a, int b, return type: int
        return a + b;
    }

    // 3. Call a function (How to use it)
    public static void main(String[] args) {
        int sum = add(3, 5); // calling the add function
        System.out.println("Sum: " + sum); // Output: Sum: 8

        // Recursion example
        int fact = factorial(5); // calling the recursive function
        System.out.println("Factorial of 5: " + fact); // Output: Factorial of 5: 120
    }

    // Recursion
    // 1. Define a recursive function
    // This function calculates the factorial of a number n
    public static int factorial(int n) {
        // 2. Base case
        if (n == 0) {
            return 1;
        }
        // 3. Recursive case
        return n * factorial(n - 1);
    }
}
