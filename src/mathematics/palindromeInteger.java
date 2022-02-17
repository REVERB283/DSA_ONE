package mathematics;

public class palindromeInteger {

    public static int palindrome(int A) {
        if (A < 0) return 0;

        int divisor = A;
        int remainder = 0;
        int result = 0;

        while (divisor != 0) {
            remainder = divisor % 10;
            result = result * 10 + remainder;
            divisor /= 10;
        }

        return result == A ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(12121));
    }
}
