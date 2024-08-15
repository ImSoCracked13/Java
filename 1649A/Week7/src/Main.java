
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {             
            System.out.println("1. Product List");
            System.out.println("2. Search Product");
            System.out.println("3. My Order");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Product List");
                    break;
                case 2:
                    System.out.println("Search Product");
                    break;
                case 3:
                    System.out.println("My Order");
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (choice != 4);
    }
}
