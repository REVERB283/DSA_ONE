package mathematics;

public class StepByStep {

    public static int solve(int A) {
        int i = 0, x = 0;
        int B = Math.abs(A);

        while (x < B || (x - B) % 2 != 0) {
            i++;
            System.out.println(x);
            x += i;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(solve(11));
//        System.out.println(solve(900028145));
    }
}
