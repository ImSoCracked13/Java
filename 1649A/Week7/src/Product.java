public class Product {
    //1. Property
    private int id;
    private String name;
    private Double price;
    private Integer quantity; //Optional

    private static int idCounter = 0;
    //2. Constructor
    public Product(String name) {
        this.id = ++idCounter;
        this.name = name;
        this.price = null;
        this.quantity = null;
    }

    public Product(String name, double price, int quantity) {
        this.id = ++idCounter;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //3. Behaviour
    public void print() {
        System.out.printf("Product ID: %-4d | Name: %-25s | Price: %-7.2f | Quantity: %-4d\n"
            , id, name, price, quantity);        
    }
    /////////////////////
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
