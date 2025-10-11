import java.util.ArrayList;

public class SearchAlgorithms {

    // Linear search for order by ID
    public static Order searchOrderById(ArrayList<Order> orders, int id) {
        for (Order order : orders) {
            if (order.getOrderId() == id) {
                return order;
            }
        }
        return null;
    }
}
