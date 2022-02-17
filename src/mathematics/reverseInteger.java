package mathematics;

public class reverseInteger {

    public static int reverse(int A) {
        long result = 0;

        while (A != 0) {
            result = result * 10 + A % 10;
            A /= 10;
        }

        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int) result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(-1146467285));
    }
}
