public class Ex03 {
    public static void main(String[] args) throws Exception {
        int A = 11;
        int B = 19;
        System.out.println("The sum of all even numbers between " + A + " and " + B + " is: " + sumEvenNumbers(A, B));
    }

    // 1. Give 2 integers A & B, find the sum of all even numbers between A and B using iteration.
    // public static int sumEvenNumbersIterative(int A, int B) {
    //     int sum = 0;
    //     for (int i = A; i <= B; i++) {
    //         if (i % 2 == 0) {
    //             sum += i; // Add even numbers to the sum
    //         }
    //     }
    //     return sum; // Return the total sum
    // }

    // 1.1 Iteration alternatives
    // int sum = 0;
    // int start = (A % 2 == 0) ? A : A + 1; // Start from the first even number
    // for (int i = start; i <= B; i += 2) { // Increment by 2 to only consider even numbers
    //     sum += i; // Add even numbers to the sum
    // }
    // System.out.println("The sum of all even numbers between " + A + " and " + B + " is: " + sum);

    // 2. Give 2 integers A & B, find the sum of all even numbers between A and B using recursion.
    // public static int sumEvenNumbers(int A, int B) {
    //     if (A > B) {
    //         return 0;
    //     }
    //     if (A % 2 != 0) {
    //         return sumEvenNumbers(A + 1, B); // Skipping odd numbers
    //     }
    //     return A + sumEvenNumbers(A + 2, B); // Only checking even numbers
    // }

    // 2.1 Recursion alternatives
    // int end = (B % 2 == 0) ? B : B - 1; // Adjust B to the last even number
    // sum = sumEvenNumbers(start, end); // Call the recursive function with adjusted B
    // System.out.println("The sum of all even numbers between " + A + " and " + B + " is: " + sum);

    private static int sumEvenNumbers(int A, int B) {
        int start = (A % 2 == 0) ? A : A + 1; // Start from the first even number
        int end = (B % 2 == 0) ? B : B - 1; // Adjust B to the last even number
        return sum(start, end); // Call the recursive function with adjusted start and end
    }

    private static int sum(int start, int end) {
        if (start==end) {
            return start;
        } 
        else {
            return sum(start, end-2) + end;
        }
    }

    // Visualize the recursion tree in range of 11 to 19:
    // sumEvenNumbers(11, 19)
    // ├── sumEvenNumbers(12, 19)
    // │   ├── sumEvenNumbers(14, 19)
    // │   │   ├── sumEvenNumbers(16, 19)
    // │   │   │   ├── sumEvenNumbers(18, 19)
    // │   │   │   │   ├── sumEvenNumbers(20, 19) // Base case: A > B, returns 0
    // │   │   │   │   └── 0
    // │   │   │   └── 18
    // │   │   └── 16   
    // │   └── 14
    // └── 12
    // The final result is 12 + 14 + 16 + 18 = 60
    // The recursion tree shows how the function calls itself with updated parameters until it reaches the base case.
}
