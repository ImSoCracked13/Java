import java.util.Scanner;


// Write a menu-driven program with exactly three operational options plus an Exit option.
// After completing any operation, redisplay the menu and continue until the user selects
// Exit. The program must validate input: reject non-integer entries and out-of-range
// choices by displaying a clear error message and re-prompting without terminating.
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 1 || choice > 4) {
                    System.out.println("Invalid choice. Please select a number between 1 and 4.");
                } else {
                    switch (choice) {
                        case 1:
                            System.out.println("You chose 1.");
                            break;
                        case 2:
                            System.out.println("You chose 2.");
                            break;
                        case 3:
                            System.out.println("You chose 3.");
                            break;
                        case 4:
                            System.out.println("Exited.");
                            break;
                    }
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.close();
    }
}
