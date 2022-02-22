package mathematics;

public class findNthFibonacci {

    static long mod = 1000000007;

    public static int fibonacci(int A) {
        long ans[][] = new long[][]{{1, 1}, {1, 0}};

        if (A == 0) return 0;

        power(ans, A - 1);

        return (int) (ans[0][0] % mod);
    }

    static void multiply(long F[][], long M[][]) {
        long x = (F[0][0] % mod) * (M[0][0] % mod) + (F[0][1] % mod) * (M[1][0] % mod);
        long y = (F[0][0] % mod) * (M[0][1] % mod) + (F[0][1] % mod) * (M[1][1] % mod);
        long z = (F[1][0] % mod) * (M[0][0] % mod) + (F[1][1] % mod) * (M[1][0] % mod);
        long w = (F[1][0] % mod) * (M[0][1] % mod) + (F[1][1] % mod) * (M[1][1] % mod);

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }

    /* Optimized version of power() in method 4 */
    static void power(long[][] ans, int n) {
        if (n == 1) return;
        long[][] temp = new long[][]{{1, 1}, {1, 0}};

        power(ans, n >> 1);                          // right shift by 1 to divide n by 2
        multiply(ans, ans);

        if ((n & 1) != 0) multiply(ans, temp);          // odd number
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(50));
    }
}
