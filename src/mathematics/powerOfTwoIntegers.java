package mathematics;

public class powerOfTwoIntegers {

    public static int isPower(int A) {
        if (A == 1) return 1;

        int p;
        for (int i = 2; i * i <= A; i++) {
            p = (int) (Math.log(A) / Math.log(i));
            if (Math.pow(i, p) == A) return 1;
        }

        return 0;
    }


    public static void main(String[] args) {
//        System.out.println(isPower(16808));
        System.out.println(isPower(200));
        System.out.println(isPower(4));
    }
}
