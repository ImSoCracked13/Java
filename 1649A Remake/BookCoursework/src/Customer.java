import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User {
    private ArrayList<Order> orderHistory;

    public Customer(String username, String password, String email, String fullName) {
        super(username, password, email, fullName);
        this.orderHistory = new ArrayList<>();
    }

    public void viewProducts(ArrayList<Book> products) {
        System.out.println("\n--- Product List ---");
        for (Book p : products) System.out.println(p);
    }

    public void placeOrder(ArrayList<Book> products) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nAvailable Products:");
        for (Book p : products) System.out.println(p);

        System.out.print("Enter product ID to buy: ");
        int prodId = scanner.nextInt();
        Book selected = null;
        for (Book p : products) {
            if (p.getId() == prodId) {
                selected = p;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Invalid product ID.");
            return;
        }

        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();
        if (qty <= 0 || qty > selected.getStock()) {
            System.out.println("Invalid quantity. Available stock: " + selected.getStock());
            return;
        }

        // Build order
        ArrayList<Book> boughtProducts = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        boughtProducts.add(selected);
        quantities.add(qty);

        // Update stock
        selected.setStock(selected.getStock() - qty);

        Order order = new Order(this, boughtProducts, quantities);
        orderHistory.add(order);

        System.out.println("\nOrder placed successfully!");
        System.out.println(order);
    }

    public void viewOrderHistory() {
        System.out.println("\n--- Order History ---");
        if (orderHistory.isEmpty()) System.out.println("No past orders.");
        else for (Order o : orderHistory) System.out.println(o);
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }
}
