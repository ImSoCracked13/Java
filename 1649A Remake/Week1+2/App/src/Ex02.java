import java.util.Scanner;


public class Ex02 {
    public static void main(String[] args) {

        // 1. Find the maximum value among n integers
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers: " );
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE; // Initialize max to the minimum value of int
        double max2 = Double.NEGATIVE_INFINITY; // Initialize max2 to the minimum value of double
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > max) 
                max = x;
        }
        // int max = 0; // Initialize max to 0
        // Loop to read n integers
        // i is the index of the loop
        // i++ is the increment operator
        // i < n is the condition to continue the loop


        // for(int i = 0; i < n: i++) {
        //     int x = sc.nextInt();
        //     if (i == 0) {
        //         max = x;
        //     } else {
        //         if (x > max) {
        //             max = x;
        //         }
        //     }
        // }


        // 1.1 Find the maximum value among n integers in another way
        int max = 0; // Initialize max to the maximum value of int
        if (a > max) { max = a; }
        if (b > max) { max = b; }
        if (c > max) { max = c; }
        System.out.println("The maximum value is " + max);
    }
}
