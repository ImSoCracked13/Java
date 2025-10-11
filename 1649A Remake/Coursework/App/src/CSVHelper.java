import java.io.*;
import java.util.ArrayList;

public class CSVHelper {
    
    // Save books to CSV file
    public static void saveBooksToCSV(ArrayList<Book> books, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("App/src/" + filename))) {
            writer.println("Title,Author,Price,Quantity"); // Header
            
            for (Book book : books) {
                writer.printf("%s,%s,%.2f,%d%n",
                    book.getTitle(),
                    book.getAuthor(),
                    book.getPrice(),
                    book.getQuantity());
            }
            System.out.println("Books saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving books to CSV: " + e.getMessage());
        }
    }
    
    // Load books from CSV file
    public static ArrayList<Book> loadBooksFromCSV(String filename) {
        ArrayList<Book> books = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("App/src/" + filename))) {
            String line = reader.readLine(); // Skip header
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String title = parts[0];
                    String author = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    int quantity = Integer.parseInt(parts[3]);
                    
                    books.add(new Book(title, author, price, quantity));
                }
            }
            System.out.println("Books loaded from " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("CSV file not found. Starting with empty book list.");
        } catch (IOException e) {
            System.err.println("Error loading books from CSV: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing CSV data: " + e.getMessage());
        }
        
        return books;
    }
    
    // Save orders to CSV file
    public static void saveOrdersToCSV(ArrayList<Order> orders, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("App/src/" + filename))) {
            writer.println("OrderId,CustomerName,ShippingAddress,BookTitles,Status"); // Header
            
            for (Order order : orders) {
                StringBuilder bookTitles = new StringBuilder();
                for (int i = 0; i < order.getBooks().size(); i++) {
                    if (i > 0) bookTitles.append(";");
                    bookTitles.append(order.getBooks().get(i).getTitle());
                }
                
                writer.printf("%d,%s,%s,%s,%s%n",
                    order.getOrderId(),
                    order.getCustomerName(),
                    order.getShippingAddress(),
                    bookTitles.toString(),
                    order.getStatus());
            }
            System.out.println("Orders saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving orders to CSV: " + e.getMessage());
        }
    }
    
    // Load orders from CSV file
    public static ArrayList<Order> loadOrdersFromCSV(String filename, ArrayList<Book> availableBooks) {
        ArrayList<Order> orders = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("App/src/" + filename))) {
            String line = reader.readLine(); // Skip header
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    int orderId = Integer.parseInt(parts[0]);
                    String customerName = parts[1];
                    String shippingAddress = parts[2];
                    String[] bookTitles = parts[3].split(";");
                    String status = parts[4];
                    
                    ArrayList<Book> orderBooks = new ArrayList<>();
                    for (String title : bookTitles) {
                        for (Book book : availableBooks) {
                            if (book.getTitle().equals(title)) {
                                orderBooks.add(book);
                                break;
                            }
                        }
                    }
                    
                    Order order = new Order(orderId, customerName, shippingAddress, orderBooks);
                    order.setStatus(status);
                    orders.add(order);
                }
            }
            System.out.println("Orders loaded from " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("Orders CSV file not found. Starting with empty order list.");
        } catch (IOException e) {
            System.err.println("Error loading orders from CSV: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing CSV data: " + e.getMessage());
        }
        
        return orders;
    }
}