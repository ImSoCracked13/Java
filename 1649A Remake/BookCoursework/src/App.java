import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static final int OPTION_EXIT = 0;
    private static ArrayList<Book> productList = new ArrayList<>();

    public static void main(String[] args) {

        productList.add(new Book(1, "Wuthering Heights", 29.99, 10));
        productList.add(new Book(2, "Don Quixote", 39.99, 5));
        productList.add(new Book(3, "Spice and Wolf", 25.50, 7));

        System.out.println("Welcome to the Book Management System");

        Customer customer = login();
        if (customer == null) {
            System.out.println("Login failed. Exiting...");
            return;
        }

        while (menuForCustomer(customer) != OPTION_EXIT);
    }

    public static Customer login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("customer") && password.equals("123456")) {
            return new Customer(username, password, "customer@gmail.com", "Nguyen");
        }
        return null;
    }

    public static int menuForCustomer(Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Customer Menu ---");
        System.out.println("1. View Products");
        System.out.println("2. Place Order");
        System.out.println("3. View Order History");
        System.out.println("4. Sort Products by Name");
        System.out.println("5. Sort Products by Price");
        System.out.println("6. Search Order by ID");
        System.out.printf("%d. Exit\n", OPTION_EXIT);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                customer.viewProducts(productList);
                break;
            case 2:
                customer.placeOrder(productList);
                break;
            case 3:
                customer.viewOrderHistory();
                break;
            case 4:
                SortAlgorithms.sortProductsByName(productList);
                System.out.println("\nProducts sorted by Name.");
                customer.viewProducts(productList);
                break;
            case 5:
                SortAlgorithms.sortProductsByPrice(productList);
                System.out.println("\nProducts sorted by Price.");
                customer.viewProducts(productList);
                break;
            case 6:
                System.out.print("Enter Order ID to search: ");
                int id = scanner.nextInt();
                Order found = SearchAlgorithms.searchOrderById(customer.getOrderHistory(), id);
                if (found != null) System.out.println("\nOrder found:\n" + found);
                else System.out.println("Order not found.");
                break;
            case OPTION_EXIT:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        return choice;
    }
}
