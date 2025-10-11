
import java.util.Scanner;


public class Ex03 {
        public static void main(String[] args) {
        // Given a number n
        int n = 123456789;

        // (1) Find the number of digits of n
        int count = 0;
        int temp = n;
        while (temp > 0){
            temp /= 10; // Remove the last digit
            count++; // Increment the count
        }
        System.out.println("The number of digits in " + n + " is: " + count); 


        // (2) Find the largest digit of n
        int largestDigit = 0;
        temp = n;
        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            if (digit > largestDigit) {
                largestDigit = digit; // Update the largest digit
            }
            temp /= 10; // Remove the last digit
        }
        System.out.println("The largest digit in " + n + " is: " + largestDigit);


        // (2.1) Find the largest digit of n in another way
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0; // Initialize max to the maximum value of int
        do { 
            int digit = n % 10; // Get the last digit
            System.out.println("The last digit is: " + digit);
            if (digit > max) {
                max = digit; // Update the largest digit
            }
        } while (n > 0);
        System.out.println("The largest digit in " + n + " is: " + max);


        // (3) Establish the largest number from the digits of n
        int[] digits = new int[count];
        temp = n;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10; // Get the last digit
            temp /= 10; // Remove the last digit
        }
        System.out.print("The largest number from the digits of " + n + " is: ");
    }
}
