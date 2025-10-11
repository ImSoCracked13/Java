import java.util.ArrayList;

public class SortAlgorithms {

    // Insertion Sort by product name
    public static void sortProductsByName(ArrayList<Book> products) {
        for (int i = 1; i < products.size(); i++) {
            Book key = products.get(i);
            int j = i - 1;
            while (j >= 0 && products.get(j).getName().compareToIgnoreCase(key.getName()) > 0) {
                products.set(j + 1, products.get(j));
                j--;
            }
            products.set(j + 1, key);
        }
    }

    // Selection Sort by price
    public static void sortProductsByPrice(ArrayList<Book> products) {
        for (int i = 0; i < products.size() - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(j).getPrice() < products.get(minIdx).getPrice()) {
                    minIdx = j;
                }
            }
            // swap
            Book temp = products.get(minIdx);
            products.set(minIdx, products.get(i));
            products.set(i, temp);
        }
    }
}

