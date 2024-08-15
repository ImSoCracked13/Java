import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;

// MainProgram.java
public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BooksList bookList = new BooksList();
        Functions functions = new Functions(bookList.getBooksList());

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("Choose an option:");
            System.out.println("1. Place an order");
            System.out.println("2. Display all orders");
            System.out.println("3. Delete an order by ID");
            System.out.println("4. Sort orders by book price");
            System.out.println("5. Search");
            System.out.println("6. Sort books by name");
            System.out.println("7. Exit");
            System.out.println("-----------------------------------");

            int choice = -1;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid data type. Please enter a number.");
                scanner.nextLine(); // consume the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter order ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // consume newline

                        System.out.print("Enter customer name: ");
                        String customerName = scanner.nextLine();

                        System.out.print("Enter shipping address: ");
                        String shippingAddress = scanner.nextLine();

                        System.out.print("Enter book ID: ");
                        int bookId = scanner.nextInt();
                        scanner.nextLine(); // consume newline

                        Books book = functions.getBooksList().stream()
                                .filter(b -> b.getId() == bookId)
                                .findFirst()
                                .orElse(null);

                        if (book != null) {
                            Orders order = new Orders(id, customerName, shippingAddress, book);
                            functions.addOrder(order);
                            System.out.println("Order placed successfully!");
                        } else {
                            System.out.println("Book not found!");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid data type. Please enter the correct data type.");
                        scanner.nextLine(); // consume the invalid input
                    }
                    break;
                case 2:
                    System.out.println("All Orders:");
                    functions.displayAllOrders();
                    break;
                case 3:
                    try {
                        System.out.print("Enter order ID to delete: ");
                        int deleteOrderId = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        functions.deleteOrderById(deleteOrderId);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid data type. Please enter a number.");
                        scanner.nextLine(); // consume the invalid input
                    }
                    break;
                case 4:
                    functions.sortOrdersByPrice();
                    System.out.println("Orders sorted by book price.");
                    functions.displayAllOrders();
                    break;
                case 5:
                    System.out.println("-----------------------------------");
                    System.out.println("Search:");
                    System.out.println("1. Books by ID");
                    System.out.println("2. Books by name");
                    System.out.println("3. Orders by ID");
                    System.out.println("4. Orders by customer name");
                    System.out.println("-----------------------------------");

                    int searchChoice = -1;
                    try {
                        searchChoice = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid data type. Please enter a number.");
                        scanner.nextLine(); // consume the invalid input
                        continue;
                    }

                    switch (searchChoice) {
                        case 1:
                            try {
                                System.out.print("Enter book ID: ");
                                int searchBookId = scanner.nextInt();
                                Books foundBookById = functions.searchBookById(searchBookId);
                                if (foundBookById != null) {
                                    System.out.println("Book found: " + foundBookById);
                                } else {
                                    System.out.println("Book not found!");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid data type. Please enter a number.");
                                scanner.nextLine(); // consume the invalid input
                            }
                            break;
                        case 2:
                            System.out.print("Enter book name: ");
                            String searchBookName = scanner.nextLine();
                            List<Books> foundBooksByName = functions.searchBooksByName(searchBookName);
                            if (!foundBooksByName.isEmpty()) {
                                System.out.println("Books found:");
                                foundBooksByName.forEach(System.out::println);
                            } else {
                                System.out.println("No books found!");
                            }
                            break;
                        case 3:
                            try {
                                System.out.print("Enter order ID: ");
                                int searchOrderId = scanner.nextInt();
                                Orders foundOrderById = functions.searchOrderById(searchOrderId);
                                if (foundOrderById != null) {
                                    System.out.println("Order found: " + foundOrderById);
                                } else {
                                    System.out.println("Order not found!");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid data type. Please enter a number.");
                                scanner.nextLine(); // consume the invalid input
                            }
                            break;
                        case 4:
                            System.out.print("Enter customer name: ");
                            String searchCustomerName = scanner.nextLine();
                            List<Orders> foundOrdersByName = functions.searchOrdersByName(searchCustomerName);
                            if (!foundOrdersByName.isEmpty()) {
                                System.out.println("Orders found:");
                                foundOrdersByName.forEach(System.out::println);
                            } else {
                                System.out.println("No orders found!");
                            }
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    break;
                case 6:
                    functions.sortBooksByName();
                    System.out.println("Books sorted by name.");
                    for (Books sortedBook : functions.getBooksList()) {
                        System.out.println(sortedBook);
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
