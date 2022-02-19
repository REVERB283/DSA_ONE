package mathematics;

public class excelColumnNumber {

    public static int titleToNumber(String A) {
        int result = 0;

        for (int i = 0; i < A.length(); i++) {
            int valueChar = A.charAt(A.length() - i - 1) - 'A' + 1;
            result += valueChar * (int) Math.pow(26, i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(704/26);
        System.out.println("AB ----> " + titleToNumber("AB"));
        System.out.println("ZZ ----> " + titleToNumber("ZZ"));
        System.out.println("AAA ----> " + titleToNumber("AAA"));
    }
}
