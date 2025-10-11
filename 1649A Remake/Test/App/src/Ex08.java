public class Ex08 {
    // Implement a search() function to return the index of the last occurrence of an element in an array of strings.
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "elderberry"};
        String target = "cherry";
        int index = search(strings, target);
        if (index != -1) {
            System.out.println("The index of the last occurrence of " + target + " is: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }

    public static int search(String[] strings, String target) {
        for (int i = strings.length - 1; i > 0; i--) {
            if (strings[i] == target) {
                return i;
            }
        }
        return -1; // Return -1 if the target is not found
    }
}