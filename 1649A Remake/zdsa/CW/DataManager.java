package CW;

import java.io.*;
import java.util.*;

public class DataManager {
    private static final String PRODUCTS_FILE = "CW/products.csv";
    private static final String ORDERS_STACK_FILE = "CW/orders.csv";
    private static final String ORDERS_QUEUE_FILE = "CW/order_queue.csv";

    // Save products to file
    public static void saveProducts(ArrayList<Product> products) {
        try (FileWriter writer = new FileWriter(PRODUCTS_FILE)) {
            for (Product product : products) {
                writer.write(product.getName() + "," + product.getPrice() + "," + product.getQuantity() + "\n");
            }
            System.out.println("Products saved successfully");
        } catch (IOException e) {
            System.out.println("Error saving products: " + e.getMessage());
        }
    }

    // Load products from file
    public static ArrayList<Product> loadProducts() {
        ArrayList<Product> products = new ArrayList<>();
        File file = new File(PRODUCTS_FILE);

        if (!file.exists()) {
            return products; // Return empty list if file doesn't exist yet
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    Product product = new Product();
                    product.setAll(parts[0], Float.parseFloat(parts[1]), Integer.parseInt(parts[2]));
                    products.add(product);
                }
            }
            System.out.println("Products loaded successfully");
        } catch (FileNotFoundException e) {
            System.out.println("Products file not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error loading products: " + e.getMessage());
        }
        return products;
    }

    // Save orders to file
    public static void saveOrders(OrderStack orderStack) {
        try (FileWriter writer = new FileWriter(ORDERS_STACK_FILE)) {
            // We need to temporarily store orders in another stack to avoid losing them
            OrderStack tempStack = new OrderStack();

            while (!orderStack.isEmpty()) {
                Order order = orderStack.pop();
                writer.write(order.getId() + "," + order.getShippingAddress() + "," +
                        order.getBooks() + "," + order.getQuantity() + "\n");
                tempStack.push(order);
            }

            // Restore orders to original stack
            while (!tempStack.isEmpty()) {
                orderStack.push(tempStack.pop());
            }

            System.out.println("Orders saved successfully");
        } catch (IOException e) {
            System.out.println("Error saving orders: " + e.getMessage());
        }
    }

    // Load orders from file
    public static void loadOrders(OrderStack orderStack) {
        File file = new File(ORDERS_STACK_FILE);

        if (!file.exists()) {
            return; // Return if file doesn't exist yet
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    Order order = new Order();
                    order.setOrder(Integer.parseInt(parts[0]), parts[1], parts[2], Integer.parseInt(parts[3]),
                            Float.parseFloat(parts[4]));
                    orderStack.push(order);
                }
            }
            System.out.println("Orders loaded successfully");
        } catch (FileNotFoundException e) {
            System.out.println("Orders file not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error loading orders: " + e.getMessage());
        }
    }

    // Save queue orders to file
    public static void saveQueue(OrderQueue orderQueue) {
        try (FileWriter writer = new FileWriter(ORDERS_QUEUE_FILE)) {
            // We need to temporarily store orders in another queue to avoid losing them
            OrderQueue tempQueue = new OrderQueue();

            while (!orderQueue.isEmpty()) {
                Order order = orderQueue.dequeue();
                writer.write(order.getId() + "," + order.getShippingAddress() + "," +
                        order.getBooks() + "," + order.getQuantity() + "," + order.getPrice() + "\n");
                tempQueue.enqueue(order);
            }

            // Restore orders to original queue
            while (!tempQueue.isEmpty()) {
                orderQueue.enqueue(tempQueue.dequeue());
            }

            System.out.println("Queue orders saved successfully");
        } catch (IOException e) {
            System.out.println("Error saving queue orders: " + e.getMessage());
        }
    }

    // Load queue orders from file
    public static void loadQueue(OrderQueue orderQueue) {
        File file = new File(ORDERS_QUEUE_FILE);

        if (!file.exists()) {
            return; // Return if file doesn't exist yet
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 5) {
                    Order order = new Order();
                    order.setOrder(Integer.parseInt(parts[0]), parts[1], parts[2],
                            Integer.parseInt(parts[3]), Float.parseFloat(parts[4]));
                    orderQueue.enqueue(order);
                }
            }
            System.out.println("Queue orders loaded successfully");
        } catch (FileNotFoundException e) {
            System.out.println("Queue orders file not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error loading queue orders: " + e.getMessage());
        }
    }
}