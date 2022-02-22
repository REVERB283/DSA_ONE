package mathematics;

public class StepByStep {

    public static int solve(int A) {
        int i = 0, sum = 0;
        int B = Math.abs(A);

        while (sum < B || ((sum - B) & 1) != 0) {
            i++;
            System.out.println(sum);
            sum += i;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(solve(11));
//        System.out.println(solve(900028145));
    }
}
