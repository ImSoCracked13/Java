public class Ex14 {
    //  Write a program to identify the missing number in a sequence of integers ranging from 1 to n (where exactly one number in the range is absent)
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9};
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);
    }
    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;
        int sum = n * (n + 1) / 2;
        
        int actualSum = 0;
        for (int i = 0; i < array.length; i++) {
            actualSum = actualSum + array[i]; 
        }
        
        return sum - actualSum;
    }
}
