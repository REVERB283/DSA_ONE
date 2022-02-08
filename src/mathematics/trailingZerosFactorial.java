package mathematics;

public class trailingZerosFactorial {

    public static int findFactorial(int n) {
        int result = 1;

        for (int i = 2; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public static int findTrailingZerosFactorial(int n) {
        int result = 0;

        for (int i = 5; i <= n; i *= 5) {
            result = result + n / i;
        }

        return result;
    }

    public static void main(String[] args) {
//        System.out.println(findFactorial(5));
        System.out.println(findTrailingZerosFactorial(30));
    }
}
