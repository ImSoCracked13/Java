package CW;

import java.util.ArrayList;
import java.util.Scanner;

public class CWApp {

    public static OrderStack orderStack = new OrderStack();
    public static OrderQueue orderQueue = new OrderQueue();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // Try to load products from file first
        ArrayList<Product> products = DataManager.loadProducts();

        // If no products were loaded, initialize with defaults
        if (products.isEmpty()) {
            products = initializeDefaultProducts();
        }

        // Try to load orders from files
        // DataManager.loadOrders(orderStack);
        // DataManager.loadQueue(orderQueue);

        do {
            System.out.println("=========================================");
            System.out.println("\nWelcome to the online store");
            System.out.println("1. Product List");
            System.out.println("2. Make orders");
            System.out.println("3. Search Product");
            System.out.println("4. Sort all products by price");
            System.out.println("5. Sort all products by name");
            System.out.println("6. My orders");
            System.out.println("7. Place/Process orders");
            System.out.println("8. Save data");
            System.out.println("9. Exit");
            System.out.println("-----------------------------------------");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    printProducts(products);
                    break;
                case 2:
                    makeOrder(products);
                    break;
                case 3:
                    Scanner sca = new Scanner(System.in);
                    // sca.nextLine();

                    System.out.println("Enter product's name:");
                    String searchInput = sca.nextLine();

                    Product searchProductName = searchProductByName(products, searchInput);
                    if (searchProductName != null) {
                        System.out.println(searchProductName.getName() + ";" + searchProductName.getPrice());
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    ArrayList<Product> ssortByPrice = sortByPrice(products);
                    for (Product product : ssortByPrice) {
                        ;
                        System.out.println(product.getName() + ";" + product.getPrice());
                    }
                    break;
                case 5:
                    ArrayList<Product> ssortByName = sortByName(products);
                    for (Product product : ssortByName) {
                        ;
                        System.out.println(product.getName() + ";" + product.getPrice());
                    }
                    break;
                case 6:
                    viewOrder(orderStack);
                    break;
                case 7:
                    processOrders();
                    break;
                case 8:
                    // Save data to files
                    DataManager.saveProducts(products);
                    DataManager.saveOrders(orderStack);
                    DataManager.saveQueue(orderQueue);
                    System.out.println("All data saved successfully!");
                    break;
                default:
                    // No action needed for default case
            }

        } while (choice != 9);

        // Save data before exiting
        DataManager.saveProducts(products);
        DataManager.saveOrders(orderStack);
        DataManager.saveQueue(orderQueue);
        System.out.println("Data saved. Thank you for using the online store!");
    }

    // Initialize default products
    private static ArrayList<Product> initializeDefaultProducts() {
        Product p1 = new Product();
        p1.setAll("Summer Tunnel", 1200, 20);

        Product p2 = new Product();
        p2.setAll("3 days of happiness", 1500, 20);

        Product p3 = new Product();
        p3.setAll("Oregairu", 1800, 20);

        Product p4 = new Product();
        p4.setAll("Bunny Girl Senpai", 1100, 20);

        Product p5 = new Product();
        p5.setAll("Rezero", 1000, 20);

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        return products;
    }

    // 1.List all product
    private static void printProducts(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.println("=========================================");
            System.out.println(product.getName() + ";" + product.getPrice());
        }
    }

    // 2.make order
    private static void makeOrder(ArrayList<Product> products) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product name:");
        String choice = sc.nextLine();

        sc.nextLine();

        System.out.println("Enter shipping address:");
        String shippingAddress = sc.nextLine();

        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();

        Product product = searchProductByName(products, choice);
        if (!products.contains(product)) {
            System.out.println("Product does not exist");
            return;
        } else {
            Order order = new Order();
            order.setOrder(1, shippingAddress, product.getName(), quantity, product.getPrice());
            orderStack.push(order); // Add to stack for user session view
            orderQueue.enqueue(order); // Add to queue for processing
            DataManager.saveOrders(orderStack);
            DataManager.saveQueue(orderQueue);
            System.out.println("=========================================");
            System.out.println("Order added to both stack and processing queue!");
            System.out.println("-----------------------------------------");
        }
    }

    // 3.search product
    private static Product searchProductByName(ArrayList<Product> products, String sth) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(sth)) {
                return product;
            }
        }
        return null;
    }

    // 4 sort by price
    private static ArrayList<Product> sortByPrice(ArrayList<Product> products) {
        ArrayList<Product> newProductsList = new ArrayList<>(products);

        for (int i = 0; i < newProductsList.size(); i++) {
            boolean swapped = false;
            for (int j = 0; j < newProductsList.size() - i - 1; j++) {

                if (newProductsList.get(j).getPrice() > newProductsList.get(j + 1).getPrice()) {
                    Product temp = newProductsList.get(j);
                    newProductsList.set(j, newProductsList.get(j + 1));
                    newProductsList.set(j + 1, temp);
                    swapped = true;
                    // int temp = arr[j];
                    // arr[j] = arr[j+1];
                    // arr[j+1] = temp;
                    // swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return newProductsList;
    }

    // 5 sort by name
    private static ArrayList<Product> sortByName(ArrayList<Product> products) {
        ArrayList<Product> newProductsList = new ArrayList<>(products);

        for (int i = 0; i < newProductsList.size(); i++) {
            boolean swapped = false;
            for (int j = 0; j < newProductsList.size() - i - 1; j++) {
                if (newProductsList.get(j).getName().compareToIgnoreCase(newProductsList.get(j + 1).getName()) > 0) {
                    Product temp = newProductsList.get(j);
                    newProductsList.set(j, newProductsList.get(j + 1));
                    newProductsList.set(j + 1, temp);
                    swapped = true;
                    // int temp = arr[j];
                    // arr[j] = arr[j+1];
                    // arr[j+1] = temp;
                    // swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return newProductsList;
    }

    // 6 see order
    private static void viewOrder(OrderStack orderStack) {
        if (orderStack.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }

        // Create temporary stack to preserve original
        OrderStack tempStack = new OrderStack();
        System.out.println("Your Orders:");

        while (!orderStack.isEmpty()) {
            Order order = orderStack.pop();
            System.out.println("=========================================");
            System.out.println("Order ID: " + order.getId());
            System.out.println("Book: " + order.getBooks());
            System.out.println("Quantity: " + order.getQuantity());
            System.out.println("Shipping Address: " + order.getShippingAddress());
            System.out.println("---------------------------");
            tempStack.push(order);
        }

        // Restore the original stack
        while (!tempStack.isEmpty()) {
            orderStack.push(tempStack.pop());
        }
    }

    // 7. Process orders from queue (FIFO)
    private static void processOrders() {
        if (orderQueue.isEmpty()) {
            System.out.println("No orders in processing queue.");
            return;
        }

        System.out.println("Processing orders:");
        System.out.println("=========================================");

        int processedCount = 0;
        while (!orderQueue.isEmpty()) {
            Order order = orderQueue.dequeue();
            processedCount++;

            System.out.println("Processing Order #" + processedCount);
            System.out.println("Order ID: " + order.getId());
            System.out.println("Product: " + order.getBooks());
            System.out.println("Quantity: " + order.getQuantity());
            System.out.println("Shipping Address: " + order.getShippingAddress());
            System.out.println("Total Price: $" + order.getPrice());
            System.out.println("Status: PROCESSED ✓");
            System.out.println("---------------------------------");
        }

        System.out.println("All " + processedCount + " orders have been processed!");
        System.out.println("Processing queue is now empty.");
    }
}
