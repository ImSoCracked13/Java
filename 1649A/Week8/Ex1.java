import java.util.Arrays;
import java.lang.Math;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int count = 0;
        count = 5;

        for(int i=0; i<count; i++) {
            arr[i] = (int)Math.random()*100;
        }
        
        int i = 0;
        while(i<1000) {
            if(count == arr.length)
                Arrays.copyOf(arr, arr.length*2);
            arr[count++] = -2-i;
            i++;
        }
        System.out.println("Element total: " + count);
        System.out.println("Arr length: " + arr.length);
        System.out.println(Arrays.toString(arr));

        for(int j=5; j>=5; j--) {
            arr[j+1] = arr[j];
        }
        System.out.println(Arrays.toString(arr));
    }
}