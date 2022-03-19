package mathematics;

public class fastPower {

    public static long findFastPower(long a, long b, int M) {
        long result = 1;

        while (b != 0) {
            if ((b & 1) != 0)
                result = (result * (a % M)) % M;

            a = ((a % M) * (a % M)) % M;
            b >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findFastPower(288979, 576, 1000000007));
    }
}
