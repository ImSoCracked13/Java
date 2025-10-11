public class Test {
    public static void main(String[] args) {
        int n = 10; // Example value for n
        int count = 0; // Initialize count to 0

        for (int i = 1; i <= n; i++){		//Outer loop
            for(int j = 1; j <= 10; j++) {	//Inner loop
                System.out.println(count + " Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
    }
}
