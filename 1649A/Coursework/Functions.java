import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

// Functions.java
public class Functions {
    private Queue<Orders> orderQueue;
    private List<Books> booksList;

    public Functions(List<Books> booksList) {
        this.booksList = booksList;
        orderQueue = new LinkedList<>();
    }

    // Adding an order to the queue
    public void addOrder(Orders order) {
        orderQueue.add(order);
    }

    public Queue<Orders> getOrderQueue() {
        return orderQueue;
    }

    public List<Books> getBooksList() {
        return booksList;
    }

    // Displaying all orders in the queue
    public void displayAllOrders() {
        if (orderQueue.isEmpty()) {
            System.out.println("No orders to display.");
        } else {
            for (Orders order : orderQueue) {
                System.out.println(order);
            }
        }
    }

    // Deleting an order by ID
    public void deleteOrderById(int id) {
        Orders orderToDelete = null;
        for (Orders order : orderQueue) {
            if (order.getId() == id) {
                orderToDelete = order;
                break;
            }
        }
        if (orderToDelete != null) {
            orderQueue.remove(orderToDelete);
            System.out.println("Order with ID " + id + " deleted.");
        } else {
            System.out.println("Order with ID " + id + " not found.");
        }
    }

    // Sorting orders by book price using mergesort
    public void sortOrdersByPrice() {
        List<Orders> ordersList = new ArrayList<>(orderQueue);
        ordersList = mergeSortOrdersByPrice(ordersList);
        orderQueue.clear();
        orderQueue.addAll(ordersList);
    }

    // Mergesort algorithm for orders based on book price
    private List<Orders> mergeSortOrdersByPrice(List<Orders> orders) {
        if (orders.size() <= 1) {
            return orders;
        }
        int mid = orders.size() / 2;
        List<Orders> left = new ArrayList<>(orders.subList(0, mid));
        List<Orders> right = new ArrayList<>(orders.subList(mid, orders.size()));

        left = mergeSortOrdersByPrice(left);
        right = mergeSortOrdersByPrice(right);

        return mergeOrdersByPrice(left, right);
    }

    private List<Orders> mergeOrdersByPrice(List<Orders> left, List<Orders> right) {
        List<Orders> merged = new ArrayList<>();
        int leftIndex = 0, rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).getBook().getPrice() <= right.get(rightIndex).getBook().getPrice()) {
                merged.add(left.get(leftIndex++));
            } else {
                merged.add(right.get(rightIndex++));
            }
        }

        while (leftIndex < left.size()) {
            merged.add(left.get(leftIndex++));
        }

        while (rightIndex < right.size()) {
            merged.add(right.get(rightIndex++));
        }

        return merged;
    }

    // Sorting books by name using mergesort
    public void sortBooksByName() {
        booksList = mergeSortBooksByName(booksList);
    }

    // Mergesort algorithm for books based on name
    private List<Books> mergeSortBooksByName(List<Books> books) {
        if (books.size() <= 1) {
            return books;
        }
        int mid = books.size() / 2;
        List<Books> left = new ArrayList<>(books.subList(0, mid));
        List<Books> right = new ArrayList<>(books.subList(mid, books.size()));

        left = mergeSortBooksByName(left);
        right = mergeSortBooksByName(right);

        return mergeBooksByName(left, right);
    }

    private List<Books> mergeBooksByName(List<Books> left, List<Books> right) {
        List<Books> merged = new ArrayList<>();
        int leftIndex = 0, rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).getName().compareTo(right.get(rightIndex).getName()) <= 0) {
                merged.add(left.get(leftIndex++));
            } else {
                merged.add(right.get(rightIndex++));
            }
        }

        while (leftIndex < left.size()) {
            merged.add(left.get(leftIndex++));
        }

        while (rightIndex < right.size()) {
            merged.add(right.get(rightIndex++));
        }

        return merged;
    }

    // Linear search for books by ID
    public Books searchBookById(int id) {
        for (Books book : booksList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    // Linear search for books by name
    public List<Books> searchBooksByName(String name) {
        return booksList.stream()
                .filter(book -> book.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Linear search for orders by ID
    public Orders searchOrderById(int id) {
        for (Orders order : orderQueue) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    // Linear search for orders by customer name
    public List<Orders> searchOrdersByName(String customerName) {
        return orderQueue.stream()
                .filter(order -> order.getCustomerName().toLowerCase().contains(customerName.toLowerCase()))
                .collect(Collectors.toList());
    }

}
