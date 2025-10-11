public class Test {
    public static void main(String[] args) {
        // Initialize an array with both negative and non-negative numbers
        int[] arr = {3, -1, 4, -5, 2, 0};

        // 1. Search: Find the index of value 4 in the array
        System.out.println("Index of 4: " + search(arr, 4));

        // 2.1. Partition: Move all negative numbers to the left, non-negatives to the right
        partition(arr);
        System.out.println("Partitioned: " + java.util.Arrays.toString(arr));

        // 2.2. Reverse: Reverse the order of the array
        reverse(arr);
        System.out.println("Reversed: " + java.util.Arrays.toString(arr));

        // 2.3. Sort Ascending: Sort the array in increasing order
        sortAscending(arr);
        System.out.println("Sorted Asc: " + java.util.Arrays.toString(arr));

        // 2.3. Sort Descending: Sort the array in decreasing order
        sortDescending(arr);
        System.out.println("Sorted Desc: " + java.util.Arrays.toString(arr));

        // 3. CRUD: Demonstrate delete operation
        int[] arr2 = {1, 2, 3, 4, 5}; // Create and initialize an array
        arr2 = deleteAtIndex(arr2, 2); // Delete the element at index 2 (the value 3)
        System.out.println("After delete: " + java.util.Arrays.toString(arr2));

        // 3. CRUD: Demonstrate update operation
        updateAtIndex(arr2, 1, 99); // Update the element at index 1 to 99
        System.out.println("After update: " + java.util.Arrays.toString(arr2));

        // Add a new element to the end of the array
        // Returns a new array with the new element appended
        int[] newArr = addElement(arr2, 100);
        System.out.println("After adding new element: " + java.util.Arrays.toString(newArr));
    }

    // Linear search for a value in an array
    // Returns the index of the target if found, otherwise -1
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found at index i
            }
        }
        return -1; // Not found
    }

    // Partition: Move all negative numbers to the left, non-negatives to the right
    // Uses two pointers to swap elements in place
    public static void partition(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Move left pointer until a non-negative is found
            while (arr[left] < 0 && left < right) left++;
            // Move right pointer until a negative is found
            while (arr[right] >= 0 && left < right) right--;
            // Swap if left is before right
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    // Lomuto Partition: Partitions an array around a pivot for QuickSort
    // Places pivot at its correct sorted position and elements smaller to its left, larger to its right
    public static int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Reverse the array in place
    // Swaps elements from both ends moving towards the center
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Sort the array in ascending order using Java's built-in sort
    public static void sortAscending(int[] arr) {
        java.util.Arrays.sort(arr);
    }

    // Sort the array in descending order
    // First sort ascending, then reverse the array
    public static void sortDescending(int[] arr) {
        java.util.Arrays.sort(arr);
        reverse(arr);
    }

    // Delete the element at the specified index
    // Returns a new array with the element removed
    public static int[] deleteAtIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) return arr; // Invalid index, return original
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    // Update the element at the specified index
    // Sets the value at the given index to newValue if index is valid
    public static void updateAtIndex(int[] arr, int index, int newValue) {
        if (index >= 0 && index < arr.length) {
            arr[index] = newValue;
        }
    }

    // Add a new element to the end of the array
    // Returns a new array with the new element appended
    public static int[] addElement(int[] arr, int newValue) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = newValue; // Add the new value at the end
        return newArr;
    }

    // Bubble Sort: Repeatedly steps through the list, compares adjacent elements
    // and swaps them if they are in the wrong order.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort: Finds the minimum element from unsorted part and puts it at the beginning
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort: Builds the final sorted array one item at a time.
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // QuickSort: A divide and conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot.
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = lomutoPartition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // MergeSort: A divide and conquer algorithm that divides the array into two halves,
    // recursively sorts them and then merges the two sorted halves.
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
