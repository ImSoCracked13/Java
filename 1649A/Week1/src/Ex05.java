
public class Ex05 {
	//TODO:
	// 1. Given an integer number X, find the largest digit of X 
	// 2. Given an integer number X in base 10,
		// represent X in a number in base 2.
	
	public static void main(String[] args) {
		int a = -319;
		int X = (a>=0)? a : (-a);

		int max = Integer.MIN_VALUE;
		do {
			int r = X%10;
			if(max < r)
				max = r;
			X = X/10;
		}while(X!=0);
		
		System.out.println("The largest digit is: " + max);
	}
}
