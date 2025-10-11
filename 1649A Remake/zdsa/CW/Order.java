package CW;

import java.util.*;

public class Order {
    private int Id;
    private String shippingAddress;
    private String books; // List of book titles
    private int quantity;
    private float price;

    // getter
    public int getId() {
        return Id;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getBooks() {
        return books;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return this.quantity * this.price;
    }

    // setter
    public void setOrder(int Id, String shippingAddress, String books, int quantity, float price) {
        this.Id = Id;
        this.shippingAddress = shippingAddress;
        this.books = books;
        this.quantity = quantity;
        this.price = price;
    }
}
