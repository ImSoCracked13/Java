public class Ex01 {
    public static void main(String[] args) throws Exception {
         // 3. Search:
        // - Linear
        // - Binary
        // - Hash Table
        // - Tree: BST, AVL, Red-Black Tree
        // - Graph: DFS, BFS

        // 3.1 Linear Search
        // Inplement and input
        int[] arr = {16, 20, 13, -4, 15, -8, 16, 4};
        int key = 3;

        // String[] deployers = {"Upstash", "Railway", "Supabase", "Docker"};
        // String content = "Docker";

        // Product[] products = new Product[]{...};
        // double lower_price =  10;
        // double upper_price = 100;

        // Process
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index" + i);
                found = true;
                break; // Stop current the loop when found, stop at that index of the found result, meaning no scanning more aftewards
            }
        } // If dont have boolean, this will print this line underneath the Found output under any condition, which is a logical error
        if (!found) {
            System.out.println("Not found");
        }

        // Process in reverse
        found = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) {
                System.out.println("Found at index" + i);
                found = true;
                break; // Stop current the loop when found, stop at that index of the found result, meaning no scanning more aftewards
            }
        } // If dont have boolean, this will print this line underneath the Found output under any condition, which is a logical error
        if (!found) {
            System.out.println("Not found");
        }
    }
}
