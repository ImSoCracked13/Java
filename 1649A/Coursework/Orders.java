// Orders.java
public class Orders {
    private int id;
    private String customerName;
    private String shippingAddress;
    private Books book;

    public Orders(int id, String customerName, String shippingAddress, Books book) {
        this.id = id;
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Order: [id=" + id + ", customerName=" + customerName + ", shippingAddress=" + shippingAddress + ", book=" + book + "]";
    }
}
