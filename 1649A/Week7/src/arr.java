import java.util.ArrayList;

public class arr {
    public static void main(String[] args) throws Exception {
        Product p1 = new Product("Laptop Dell XPS 13", 1300, 5);
        Product p2 = new Product("Macbook Pro 2022", 1500, 3);
        Product p3 = new Product("Laptop HP Spectre", 1200, 7);
        Product p4 = new Product("Laptop Asus Zenbook", 1100, 2);
        Product p5 = new Product("Laptop Lenovo Thinkpad", 1000, 4);

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        //Search products by name
        String searchName = "MSI";
        ArrayList<Product> found = search(products, searchName);

        if (found.size() == 0) {
            System.out.println("No product found with name: " + searchName);
        } else {
            System.out.println("Found " + found.size() + " product(s) with name: " + searchName);
            for (Product product : found) {
                product.print();
            }
        }
    }
    // linear search
    private static ArrayList<Product> search(ArrayList<Product> products, String searchName) {
        ArrayList<Product> found = new ArrayList<Product>();
        for (Product product : products) {
            if (product.getName().contains(searchName)) {
                found.add(product);
            }
        }
        return found;
    }
}
