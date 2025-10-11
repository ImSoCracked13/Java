public class LinearSearch {
    
    // Search book by name
    public static Book searchBookByName(Book[] books, String bookName) {
        if (books == null || bookName == null) {
            return null;
        }
        
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equalsIgnoreCase(bookName)) {
                return books[i];
            }
        }
        return null; // Book not found
    }
    
    // Search order by ID
    public static Order searchOrderById(Order[] orders, int orderId) {
        if (orders == null) {
            return null;
        }
        
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null && orders[i].getOrderId() == orderId) {
                return orders[i];
            }
        }
        return null; // Order not found
    }
}