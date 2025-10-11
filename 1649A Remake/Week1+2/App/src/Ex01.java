/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author X1
 */



import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input 3 integers a,b & c

        // 1. Calculate the average of a,b & c with decimal result
        int a, b, c;
        System.out.println("Enter 3 integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("The average of " + a + ", " + b + " and " + c + " is " + (a + b + c) / 3);
        // 2. Find the maximum value among them
        // int max = a;
        // if (b > max) {
        //     max = b;
        // }
        // if (c > max) {
        //     max = c;
        // }
        // System.out.println("The maximum value among " + a + ", " + b + " and " + c + " is " + max);

        // 2.1 Find the maximumm value among them in another way
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("The maximum value among " + a + ", " + b + " and " + c + " is " + max);

        // 3. Find the middle value among them
        int middle;

        if ((a > b && a < c) || (a < b && a > c)) {
            middle = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            middle = b;
        } else {
            middle = c;
        }

        System.out.println("The middle value among " + a + ", " + b + " and " + c + " is " + middle);


        // 4. Java operator way to divide a by b and get the decimal result
        double result = (double) a / b;
        System.out.println("The result of " + a + " divided by " + b + " is " + result);

        // 4.1 Java operator way to divide x by y and get the decimal result in another way
        int x = 22;
        int y = 4;
        double rs = (double) x / y;
        System.out.println("The result of " + x + " divided by " + y + " is " + rs);
    }
}


// Note:
// Semi colon (;) is used to terminate a statement
// Curly braces ({}) are used to define a block of code
// Parentheses (()) are used to define a method or a function
// Square brackets ([]) are used to define an array
