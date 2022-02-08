package mathematics;

import java.util.Arrays;

public class seiveOfEratosthenes {

    public static boolean[] findPrime(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            for (int j = i * 2; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPrime(27)));
    }
}
