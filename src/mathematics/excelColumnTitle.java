package mathematics;

public class excelColumnTitle {

    public static String numberToTitle(int A) {
        String title = "";

        while (A != 0) {
            A -= 1;
            title = (char) (A % 26 + 'A') + title;
            System.out.println(title + " " + A + " " + (A / 26));
            A /= 26;
        }
        return title;
    }

    public static void main(String[] args) {
        System.out.println(numberToTitle(704));
        System.out.println(numberToTitle(980089));
    }
}
