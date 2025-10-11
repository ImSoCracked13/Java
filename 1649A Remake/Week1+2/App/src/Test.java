
// Problem with integer overflow
// Java does not throw an error when an integer overflows
public class Test {
    public static void main(String[] args) {
        int a = 2147483647; // Maximum value of int Java can provided
        System.out.println("a = " + a);
        System.out.println("a + 1 = " + (a + 1)); // Overflow
        System.out.println("a + 2 = " + (a + 2)); // Overflow

        // Overflow with multiplication
        // int z = 55555 * 66666;
        long z = 55555 * 80000; // Stilll overflow even using long like this
        System.out.println("z = " + z); 

        // Better way to avoid overflow
        long s = (long) 55555 * 80000; // Cast to long
        System.out.println("s = " + s); // No overflow

        // 2. Yes or No with floating point numbers
        // float x = 0.5f;
        // if (x == 0.5f) {
        //     System.out.println("Yes");
        // } else {
        //     System.out.println("No");
        // }
        // Result: Yes

        // 2.1 Yes or No with floating point numbers
        float y = 0.7f;
        if (y == 0.7) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // Result: No


    // 3. Find the maximum value among n integers
    // Scanner sc = new Scanner(System.in);
    // int n = 10;
    // int max = Integer.MIN_VALUE; // Initialize max to the minimum value of int
    // for (int i = 0; i < n; i++) {
    //     int x = sc.nextInt();
    //     if (x > max) {
    //         max = x;
    //     }
    // }


    // 3.1 Find the maximum value among n integers in another way
    // int j = 1;
    // while (j < n) {
    //     int x = sc.nextInt();
    //     if (x > max) {
    //         max = x;
    //     }
    //     j++;
    // }

    // Do while loop
        int k = 1;
        do {
            int x = sc.nextInt();
            if (x > max) 
                max = x;
            k++;
        } while {
            (k <= n); 
        }
        System.out.println("The maximum value is " + max);
    }


    // Break and continue
    // for (int i = 0; i < n; i++) {
    //     if (i == 5) {
    //         break; // Break the loop
    //     }
}

