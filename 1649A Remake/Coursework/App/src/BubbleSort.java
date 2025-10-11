public class BubbleSort {
    
    // Sort books by price in ascending order
    public static void sortBooksByPriceAscending(Book[] books) {
        if (books == null || books.length == 0) {
            return;
        }
        
        int n = books.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (books[j] != null && books[j + 1] != null && 
                    books[j].getPrice() > books[j + 1].getPrice()) {
                    // Swap elements
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    // Sort books by price in descending order
    public static void sortBooksByPriceDescending(Book[] books) {
        if (books == null || books.length == 0) {
            return;
        }
        
        int n = books.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (books[j] != null && books[j + 1] != null && 
                    books[j].getPrice() < books[j + 1].getPrice()) {
                    // Swap elements
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
}