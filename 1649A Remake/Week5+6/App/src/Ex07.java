public class Ex07 {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Fibonacci of " + n + "is " + fib(n));

        long[] mem = new long[n-1];
        
    }

    private static long fibMem(int n, long[] mem) {
        if(n <= 2)
            mem[n] = 1;
        else{
            if(mem[n]==0)
                mem[n] = fibMem(n-1, mem) + fibMem(n - 2, mem)
        }
        return mem[n];
    }

    public static long fib(int n) {
        if (n<=2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }

    /*
        T(n) = T(n-1) + T(n-2) + c (c is a constant number of operation required in one recursive call)
            = 2*T(n-1) + c
            = 2^2 T(n-2) + 2^c
            = 2^3 T(n-3) + (2^2*c + 2*c)
            = 2^4 T(n-4) + (2^3*c + 2^2*c + 2*c)

            = 2^(n-2) T(2) + (2^(n-3) + 2^(n-4) + ... + 2^2+2+1) * c
        
            T(n) <= (2^(n-2) + 2^(n-3) + ... + 2^2 + 2 + 1) * c
            T(n) <= ((2^n-1)-1) *c
        ############
        T(n) = T(n-1) + T(n-2) + c
            >= 2*T(n-2) + c
            >= 2^2 T(n-4) + 2*c

            >= 2^(n/2-1) * T(2) + (2^(n/2-2) + 2^(n/2-3) + ... + 2^2+2+1) * c
            >= 2^(n/2-1) * c + (2^(n/2-1)-1)*c
            >= c* (2^(n/2)-1)
            => Time complexity: 0(2^n)
     */
}
