public class Test02 {
    public static void main(String[] args) {
        // Best case: O(1)
        // When program runs with a single iteration or no iterations at all.
        // This can happen if the input size is 0 or if the loop condition is never

        // Average case: O(log n)
        // When the program runs with a logarithmic number of iterations, such as when the input size is a power of 2.
        // This can happen if the loop condition is based on a logarithmic function or if the

        // Worst case: O(n)
        // When the program runs with a linear number of iterations, such as when the input size is large and the loop condition is based on a linear function.
        // This can happen if the loop condition is based on a linear function or if the input size is large enough to cause the loop to run for a long time.


        /*
            Specify the complexity of the piece of codes below 
        */

        //1
        for (int i = 0; i < n; i++) {
            System.out.println("Hey - I'm busy looking at: " + i);
        }
        // This is O(n) because the loop runs n times, performing a constant amount of work in each iteration.


        //2.1
        for (int i = 1; i <= Math.pow(2, n); i+=2){
            System.out.println("Hey - I'm busy looking at: " + i);
        }
        // This is O(2^n) because the loop runs 2^n times, performing a constant amount of work in each iteration.
        // T(n) = ?
        // i =  1, 3, 5, ..., 2^n - 1
        // 2^(n - 1) = 2^n / 2
        // The counter variable i runs from 1 to 2^n - 1 with incremental steps of 2.
        // The loop runs 2^(n - 1) times.
        // Each iteration of the loop performs a single constant number of operation (printing)
        // So Time Complexity T(n) = O(2^n / 2) = O(2^n).


        //2.2
        for (int i = 1; i <= Math.pow(2, n); i*=2){
            System.out.println("Hey - I'm busy looking at: " + i);
        }
        // This is O(n) because the loop runs logarithmically with respect to n, as i is multiplied by 2 in each iteration.
        // T(n) = ?
        // i =  1, 2, 4, ..., 2^n
        // i = 2^0, 2^1, 2^2, ..., 2^n
        // The loop runs n + 1 times.
        // Each iteration of the loop performs a single constant number of operation (printing).
        // So Time Complexity T(n) = O(n).


        //3.1
        for (int i = 1; i <= n; i++){		//Outer loop
            for(int j = 1; j <= 10; j++) {	//Inner loop
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
        // This is O(n) because the outer loop runs n times and the inner loop runs a constant number of times (10), resulting in a linear time complexity.
        // The outer loop runs n times, and for each iteration of the outer loop, the inner loop runs a constant number of times (10), resulting in a linear time complexity.
        // T(n) = n * 10 = O(n)
        // i = 1; j = 1, 2, ..., 10
        // i = 2; j = 1, 2, ..., 10
        // ...
        // i = n; j = 1, 2, ..., 10
        // Total number of iterations = n * 10 = O(n).
        // Each iteration of the inner loop performs a single constant number of operation (printing).
        // So Time Complexity T(n) = O(n).


        //3.2
        for (int i = 1; i <= n; i++){		//Outer loop
            for(int j = 1; j <= i; j++) {	//Inner loop
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
        // This is O(n^2) because the outer loop runs n times and the inner loop runs i times, where i varies from 1 to n, resulting in a quadratic time complexity.
        // T(n) = 1 + 2 + 3 + ... + n = n(n + 1)/2 = O(n^2)
        // i = 1; j = 1
        // i = 2; j = 1, 2
        // ...
        // i = n; j = 1, 2, ..., n
        // Total number of iterations = 1 + 2 + 3 + ... + n = n(n + 1)/2 = O(n^2).
        // Each iteration of the inner loop performs a single constant number of operation (printing).
        // So Time Complexity T(n) = O(n^2).


        //4.1
        for (int i = 1; i <= n; i = i * 2){
            System.out.println("Hey - I'm busy looking at: " + i);
        }
        // This is O(log n) because the loop runs logarithmically with respect to n, as i is multiplied by 2 in each iteration.
        // T(n) = ?
        // i =  1, 2, 4, ..., n
        // i = 2^0, 2^1, 2^2... , 2^x (where 2^x <= n)
        //  The loop runs x + 1 times, where x is the largest integer such that 2^x <= n.
        // 2^x <= n
        // Taking log base 2 on both sides:
        // x <= log2(n)
        // The counter variable i runs from 1 to n with multiplicative steps of 2
        // So Time Complexity T(n) = O(log n).


        //4.2
        for (int i = 1; i <= n; i++){			//Outer loop
            for(int j = 1; j <= n; j = j * 2) {	//Inner loop
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
        // This is O(n log n) because the outer loop runs n times and the inner loop runs logarithmically with respect to n, resulting in a linearithmic time complexity.
        // T(n) = ?
        // i = 1; j = 1, 2, 4, ..., n
        // i = 2; j = 1, 2, 4, ...,
        // ...
        // i = n; j = 1, 2, 4, ..., n
        // Total number of iterations = n * log n = O(n log n).
        // Each iteration of the inner loop performs a single constant number of operation (printing).
        // So Time Complexity T(n) = O(n log n).


        //-------------------------------------
        //5.
        int i = 0;
        while (n%2 == 0) {
            n = n/2;
            i++;
        }
        // This is O(log n) because the loop divides n by 2 in each iteration, resulting in logarithmic time complexity.
        // T(n) = ?
        // n = 64; i = 0
        // n = 32; i = 1
        // ...
        // n = 1; i = 6
        // The loop continues until n becomes odd, which takes log base 2 of the original value of n iterations.
        // The counter variable i runs from 0 to log2(n) with multiplicative steps of 2.
        // So Time Complexity T(n) = O(log n).


        //6.1
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = 0;
        for (int k = 0; k < n; k++)
            A[k][k] = 1;
        // This is O(n^2) because the first nested loop runs n^2 times and the second loop runs n times, resulting in a quadratic time complexity.

        //6.2
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = 0;
            for (int k = 0; k < n; k++)
                A[k][k] = 1;
        // This is O(n^2) because the first nested loop runs n^2 times and the second loop runs n times, resulting in a quadratic time complexity.

        //6.3
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                A[i][j] = 0;
                for (int k = 0; k < n; k++)
                    A[k][k] = 1;
        // This is O(n^3) because the outer loop runs n times, and for each iteration of the outer loop, the inner loops run n^2 times, resulting in a cubic time complexity.

        //-----------------------------
        //7. 
        public int fib(int n) {
            if(n <= 2) return 1;
            return fib(n-1) + fib(n-2);
        }
        // This is O(2^n) because the function makes two recursive calls for each n, leading to an exponential growth in the number of calls as n increases.
    }
}
