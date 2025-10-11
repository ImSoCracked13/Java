import java.util.ArrayList;

public class Order {
    private static int nextId = 1;
    private int orderId;
    private Customer customer;
    private ArrayList<Book> products;
    private ArrayList<Integer> quantities;
    private String status;

    public Order(Customer customer, ArrayList<Book> products, ArrayList<Integer> quantities) {
        this.orderId = nextId++;
        this.customer = customer;
        this.products = products;
        this.quantities = quantities;
        this.status = "Pending";
    }

    public int getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order #").append(orderId)
          .append(" | Customer: ").append(customer.getFullName())
          .append(" | Status: ").append(status)
          .append("\nProducts:\n");
        for (int i = 0; i < products.size(); i++) {
            sb.append(" - ").append(products.get(i).getName())
              .append(" x ").append(quantities.get(i))
              .append(" ($").append(products.get(i).getPrice()).append(")\n");
        }
        return sb.toString();
    }
}
