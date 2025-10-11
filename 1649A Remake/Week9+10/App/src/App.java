public class App {
    // Array for storing data
    private static int[] arr = new int[5];
    private static int count = 0; // Number of elements currently in array
    
    public static void main(String[] args) throws Exception {
        System.out.println("=== CRUD OPERATIONS DEMO ===\n");
        
        // Demonstrate all CRUD operations
        demonstrateCRUD();
    }
    
    public static void demonstrateCRUD() {
        // CREATE - Add some initial data
        System.out.println("1. CREATE (Adding elements):");
        create(10);
        create(20);
        create(30);
        create(40);
        printArray();
        
        // READ - Display and search for elements
        System.out.println("\n2. READ (Reading elements):");
        System.out.println("Element at index 2: " + read(2));
        System.out.println("Search for value 30: Index = " + search(30));
        System.out.println("Search for value 99: Index = " + search(99));
        printArray();
        
        // UPDATE - Modify existing elements
        System.out.println("\n3. UPDATE (Updating elements):");
        System.out.println("Updating index 1 from " + arr[1] + " to 25");
        update(1, 25);
        printArray();
        
        // DELETE - Remove elements
        System.out.println("\n4. DELETE (Deleting elements):");
        System.out.println("Deleting element at index 2 (value: " + arr[2] + ")");
        delete(2);
        printArray();
        
        // Additional operations
        System.out.println("\n5. Additional CREATE operations:");
        create(50);
        create(60); // This should trigger array expansion
        printArray();
    }
    
    // CREATE - Add element to the end of array
    public static void create(int value) {
        // Check if array is full, expand if needed
        if (count == arr.length) {
            expandArray();
        }
        arr[count] = value;
        count++;
        System.out.println("Added: " + value);
    }
    
    // READ - Get element at specific index
    public static int read(int index) {
        if (index >= 0 && index < count) {
            return arr[index];
        } else {
            System.out.println("Invalid index: " + index);
            return -1; // Error value
        }
    }
    
    // READ - Search for a value and return its index
    public static int search(int value) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1; // Not found
    }
    
    // UPDATE - Modify element at specific index
    public static void update(int index, int newValue) {
        if (index >= 0 && index < count) {
            arr[index] = newValue;
            System.out.println("Updated index " + index + " to " + newValue);
        } else {
            System.out.println("Invalid index: " + index);
        }
    }
    
    // DELETE - Remove element at specific index
    public static void delete(int index) {
        if (index >= 0 && index < count) {
            // Shift all elements to the left to fill the gap
            for (int i = index; i < count - 1; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
            System.out.println("Deleted element at index " + index);
        } else {
            System.out.println("Invalid index: " + index);
        }
    }
    
    // Helper method to expand array when full
    private static void expandArray() {
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        System.out.println("Array expanded to size: " + arr.length);
    }
    
    // Helper method to print current array state
    private static void printArray() {
        System.out.print("Array: [");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("] (Count: " + count + ", Capacity: " + arr.length + ")");
    }
}
