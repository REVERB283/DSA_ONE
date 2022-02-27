package mathematics;

public class nextSmallestPalindrome {

    public static String reverse(String A) {
        return new StringBuilder(A).reverse().toString();
    }

    public static boolean isPalindrome(String A) {
        return A.equals(reverse(A)) ? true : false;
    }

    public static String addOne(String A) {
        StringBuilder stringBuilder = new StringBuilder(A);
        int carry = 1;
        int sum = 0;

        for (int i = A.length() - 1; i > -1; i--) {
            if (carry == 0) break;

            int character = A.charAt(i) - '0';
            sum = character + carry;
            carry = sum / 10;

            stringBuilder.setCharAt(i, (char) ((sum % 10) + '0'));
        }

        return carry == 1 ? carry + stringBuilder.toString() : stringBuilder.toString();
    }

    public static String handleEven(String A) {
        int n = A.length();

        String left = A.substring(0, n >> 1);
        String right = A.substring(n >> 1);

        return reverse(left).compareTo(right) >= 1 ? left + reverse(left) : addOne(left) + reverse(addOne(left));
    }

    public static String handleOdd(String A) {
        int n = A.length();

        String left = A.substring(0, n >> 1);
        String mid = A.charAt(n >> 1) + "";
        String right = A.substring((n >> 1) + 1);

        return reverse(left).compareTo(right) >= 1 ? left + mid + reverse(left) : addOne(left + mid) + reverse(addOne(left + mid)).substring(1);
    }

    public static String nextPalindrome(String A) {
        if (isPalindrome(A)) A = addOne(A);

        if ((A.length() & 1) == 0) A = handleEven(A);
        else A = handleOdd(A);

        return A;
    }

    public static void main(String[] args) {
//        System.out.println(nextPalindrome("74094882455"));
//        System.out.println(nextPalindrome("9999999999"));
//        System.out.println(nextPalindrome("2168576189279543123341"));
//        System.out.println(nextPalindrome("83114332134597298167586122324167251171554288490471"));
        System.out.println(nextPalindrome("3598407636154209737260165754120014607177773359981826603801250947835120164061898414398808778383710734"));
    }
}
