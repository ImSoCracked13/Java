public class App {
    /**
     * This program finds the maximum value in an array of integers.
     * It iterates through the array and keeps track of the maximum value found.
     */
    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = findMax(arr);
        System.out.println("The maximum value in the array is: " + max);

        int[] brr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        max = findMax(brr);
        System.out.println("The maximum value in the array is: " + max);
    }
    // Function definition
    // <public static: OOP concepts>
    // 1. Function Naming Acceptances: findMax(), FindMax(), find_max()
    // 2. Function Naming Rejections: findmax(), findMax, find_max
    // 2. Parameters: inputs of function should match the type of the value has setfrom the function
    //                 int[], double[], String[] <expected array of integers>
    // 3. Return Type: the return type of the function should match the type of the value returned
    //                 int, double, void <expected no return value>
    

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max; // Return the maximum value found in the array
    }
}