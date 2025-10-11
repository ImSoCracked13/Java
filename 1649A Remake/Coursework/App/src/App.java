import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int nextOrderId = 1;

    public static void main(String[] args) throws Exception {
        // Load existing data
        books = CSVHelper.loadBooksFromCSV("books.csv");
        orders = CSVHelper.loadOrdersFromCSV("orders.csv", books);
        
        // Set nextOrderId based on existing orders
        if (!orders.isEmpty()) {
            int maxOrderId = 0;
            for (Order order : orders) {
                if (order.getOrderId() > maxOrderId) {
                    maxOrderId = order.getOrderId();
                }
            }
            nextOrderId = maxOrderId + 1;
        }

        // Run the program
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getUserChoice();
            
            switch (choice) {
                case 1:
                    placeOrder();
                    break;
                case 2:
                    listBooks();
                    break;
                case 3:
                    listOrders();
                    break;
                case 4:
                    searchBookByName();
                    break;
                case 5:
                    searchOrderById();
                    break;
                case 6:
                    sortBooksByPrice();
                    break;
                case 7:
                    saveData();
                    break;
                case 8:
                    running = false;
                    System.out.println("Thank you for using Online Bookstore!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    // Display the menu
    private static void displayMenu() {
        System.out.println("\n=== Bookstore System ===");
        System.out.println("1. Place Order");
        System.out.println("2. List Books");
        System.out.println("3. List Orders");
        System.out.println("4. Search Book by Name");
        System.out.println("5. Search Order by ID");
        System.out.println("6. Sort Books by Price");
        System.out.println("7. Save Data");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    // Get user choice
    private static int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // Place an order
    private static void placeOrder() {
        System.out.println("\n=== Place Order ===");
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        
        System.out.print("Enter shipping address: ");
        String shippingAddress = scanner.nextLine();
        
        ArrayList<Book> orderBooks = new ArrayList<>();
        
        System.out.print("Enter book title to order: ");
        String bookTitle = scanner.nextLine();
        
        Book book = LinearSearch.searchBookByName(books.toArray(new Book[0]), bookTitle);
        if (book != null && book.getQuantity() > 0) {
            orderBooks.add(book);
            book.setQuantity(book.getQuantity() - 1);
            System.out.println("Added: " + book.getTitle());
        } else {
            System.out.println("Book not found or out of stock!");
        }
        
        if (!orderBooks.isEmpty()) {
            Order order = new Order(nextOrderId++, customerName, shippingAddress, orderBooks);
            orders.add(order);
            System.out.println("Order placed successfully! Order ID: " + order.getOrderId());
        } else {
            System.out.println("No books added to order.");
        }
    }

    // List all books
    private static void listBooks() {
        System.out.println("\n=== Book List ===");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.printf("Title: %s | Author: %s | Price: $%.2f | Quantity: %d%n",
                    book.getTitle(), book.getAuthor(), book.getPrice(), book.getQuantity());
            }
        }
    }

    // List all orders
    private static void listOrders() {
        System.out.println("\n=== Order List ===");
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
        } else {
            for (Order order : orders) {
                System.out.printf("Order ID: %d | Customer: %s | Status: %s | Books: %d%n",
                    order.getOrderId(), order.getCustomerName(), order.getStatus(), order.getBooks().size());
            }
        }
    }

    // Search for a book by name
    private static void searchBookByName() {
        System.out.println("\n=== Search Book by Name ===");
        System.out.print("Enter book title: ");
        String bookTitle = scanner.nextLine();
        
        Book book = LinearSearch.searchBookByName(books.toArray(new Book[0]), bookTitle);
        if (book != null) {
            System.out.printf("Found: %s by %s - $%.2f (Qty: %d)%n",
                book.getTitle(), book.getAuthor(), book.getPrice(), book.getQuantity());
        } else {
            System.out.println("Book not found.");
        }
    }

    // Search for an order by ID
    private static void searchOrderById() {
        System.out.println("\n=== Search Order by ID ===");
        System.out.print("Enter order ID: ");
        try {
            int orderId = Integer.parseInt(scanner.nextLine());
            Order order = LinearSearch.searchOrderById(orders.toArray(new Order[0]), orderId);
            
            if (order != null) {
                System.out.printf("Order Found:%nID: %d%nCustomer: %s%nAddress: %s%nStatus: %s%nBooks:%n",
                    order.getOrderId(), order.getCustomerName(), order.getShippingAddress(), order.getStatus());
                for (Book book : order.getBooks()) {
                    System.out.println("  - " + book.getTitle());
                }
            } else {
                System.out.println("Order not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid order ID format.");
        }
    }

    // Sort books by price
    private static void sortBooksByPrice() {
        System.out.println("\n=== Sort Books by Price ===");
        System.out.println("1. Ascending order (Low to High)");
        System.out.println("2. Descending order (High to Low)");
        System.out.print("Choose sorting order: ");
        
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            
            // Convert ArrayList to array for sorting
            Book[] bookArray = books.toArray(new Book[0]);
            
            if (choice == 1) {
                // Use BubbleSort class to sort the array in ascending order
                BubbleSort.sortBooksByPriceAscending(bookArray);
                System.out.println("Books sorted by price (ascending).");
            } else if (choice == 2) {
                // Use BubbleSort class to sort the array in descending order
                BubbleSort.sortBooksByPriceDescending(bookArray);
                System.out.println("Books sorted by price (descending).");
            } else {
                System.out.println("Invalid choice.");
                return;
            }
            
            // Update the ArrayList with sorted array
            books.clear();
            for (int i = 0; i < bookArray.length; i++) {
                if (bookArray[i] != null) {
                    books.add(bookArray[i]);
                }
            }
            
            listBooks();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }

    // Save data to CSV files
    private static void saveData() {
        System.out.println("\n=== Save Data ===");
        CSVHelper.saveBooksToCSV(books, "books.csv");
        CSVHelper.saveOrdersToCSV(orders, "orders.csv");
        System.out.println("Data saved successfully!");
    }
}