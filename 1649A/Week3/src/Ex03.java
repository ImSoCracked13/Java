import java.util.ArrayList;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		int[] arr = new int[] {10, 8, 4, -6, 9, 8, 2};
		System.out.println("arr[]  = " + Arrays.toString(arr));
		int key = 3;
		
		//boolean flag = search(arr, key);
		//int idx = search(arr, key);
		ArrayList<Integer> found = search(arr, key);
		if(found.size()!=0) {
			System.out.println("Found, at position(s): " + found);
		}else {
			System.out.println("Not found!!!");
		}
	}

	private static ArrayList<Integer> search(int[] arr, int key) {
		ArrayList<Integer> found= new ArrayList<>();
		for(int i=0; i<arr.length; i++) { 
			if(arr[i] == key)
				found.add(i);
		}
		return found;
	}

//	private static int search(int[] arr, int key) {
//		//for(int i=0; i<arr.length; i++) { //first occurrence of the searching element
//		for(int i=arr.length-1; i>=0; i--) { //last occurrence
//			if(arr[i] == key)
//				return i;
//		}
//		return -1; //NOT FOUND
//	}

}
