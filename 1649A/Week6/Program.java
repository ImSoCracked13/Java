import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        // 1. Initialize products; 2. Read data from a file; 3. Read data from a database
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
        //////////////////////////

        do{
            //clear the console screen
            System.out.print("\033[H\033[2J");
            System.out.println("Welcome to the online store");
            System.out.println("1. Product List");
            System.out.println("2. Search Product");
            System.out.println("3. My orders");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    printProducts(products);
                    subMenuProduct(products);
                    break;
                case 2:
                    System.out.println("Search Product");
                    break;
                case 3:
                    System.out.println("My orders");
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 4);
    }

    private static void subMenuProduct(ArrayList<Product> products) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Add product");
            System.out.println("2. Delete product");
            System.out.println("3. Update product");
            System.out.println("4. View original product list");
            System.out.println("5. Sort products by price");
            System.out.println("6. Order product(s)");
            System.out.println("7. Back to main menu");

            System.out.print("Choose an option: ");
            choice = sc.nextInt();
        }while(choice != 7);
    }

    private static void printProducts(ArrayList<Product> products) {
        for (Product product : products) {
            product.print();
        }
    }
}
