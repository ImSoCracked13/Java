public class Ex01 {
    // public static void main(String[] args) throws Exception {
    //     // Create a search function that applies linear search algorithm
    //     int[] arr = {5, -6, 9, 1, 15, 11, 2, -10};
    //     int target = 11;
    //     // Call the linear search function and print the result
    //     int index = linearSearch(arr, target);
    //     if (index != -1) {
    //         System.out.println("Element " + target + " found at index: " + index);
    //     } else {
    //         System.out.println("Element " + target + " not found in the array.");
    //     }
    // }
    
    // public static int linearSearch(int[] arr, int target) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == target) {
    //             return i; // Return the index of the target if found
    //         }
    //     }
    //     return -1; // Return -1 if the target is not found
    // }


    // Alternative way to implement linear search using boolean flag
    public static void main(String[] args) throws Exception {
        int[] arr = {5, -6, 9, 1, 15, 11, 2, -10};
        int target = 11;
        boolean found = linearSearch(arr, target);
        if (found) {
            System.out.println("Element " + target + " found in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true; // Return true if the target is found
            }
        }
        return false; // Return false if the target is not found
    }
}
