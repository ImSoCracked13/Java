import java.util.ArrayList;

public class Order {
    private int orderId;
    private String customerName;
    private String shippingAddress;
    private ArrayList<Book> books;
    private String status;

    public Order(int orderId, String customerName, String shippingAddress, ArrayList<Book> books) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.books = books;
        this.status = "Pending";
    }

    // Getters
    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", books=" + books +
                ", status='" + status + '\'' +
                '}';
    }
}