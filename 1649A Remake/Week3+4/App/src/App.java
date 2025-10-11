public class App {
    public static void main(String[] args) throws Exception {
        // 1. Array:
        // - A datastructure that stores
        // - A collection of elements of the same type
        // - A fixed size
        // - A linear data structure
        // - a contigious memory location


        int x;
        int [] arr;
        int x = 4;
        int x = 8; // overwrites the previous code
        int y = 12; // Declaration straightfowardly

        arr = new int[]{2, 4, 6, 8, 10};
        arr = new int[10]; // Initialize an array with default values (0)
        // arr = new int[]{0, 0, 0, 0, 0,};

        // Inside a square bracket is the length of the array or capacity can be set to be stored

        String[] names = {"Elysia", "Solid", "Bun", "MinIO"};
        names = new String[10]; //Default values are null

        //Student[] students = new Student[40];
        System.out.println("The length of array is:" + arr.length); // Result: 10 
        arr.length = 40; // Force fixated array variable

        // size - count: the currrent number of elements used in the array

        System.out.println(x); // Need to set a variable
        System.out.println(arr); //Read
        System.out.println(arr[0]); 


        // 2. Accessing elements in the array
        // An element in the array is accessed by its position in the array
        // Index: 0 -> (length-1)
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

        System.out.println(arr[-1]); //Notice the error
        System.out.println(arr[arr.length]); //Notice the error

        // Compile time error ve Runtime error
        System.out.println("Hi Pal!");

        //Print all elements in the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 1; i < arr.length * 2; i+=2) {
            System.out.print(arr[count++] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));

        //Print all elements in the array in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
        
    }
}
