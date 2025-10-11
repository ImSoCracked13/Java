import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int x = 5;
        int[] arr = {7, 10, 1337, 9000, 96};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(x + " Yes King!");

        //Standard input/output in Java
        System.out.print("Hello, world!\n");
        System.out.println("Hello, world!");
        System.out.printf("Hello, %s!\n", "King");

        //Standard input in Java
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); //Reads the next line of input from the user
        System.out.println("Hello, " + name + "!");

        // Formatting display of decimal numbers in Java
        int a, b;
        System.out.println("Enter 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The sum of  " + a + " and " + b + " is " + (a + b));
        System.out.printf("The sum of %d and %.2f is %.2f\n", a, b, a + b);
    }
}
