package arrays;

public class waysToSum {

    private static final long overflow = 1000000007;

    public static int ways(int total, int k) {
        int[] arr = new int[total + 1];
        int n = arr.length;
        arr[0] = 1;

        for (int i = 1; i <= k; i++) {
            for (int j = i; j < n; j++) {
                arr[j] = (int) ((arr[j] + arr[j - i]) % overflow);
            }

        }

        return arr[total];
    }

    public static void main(String[] args) {
        int total = 5;
        int k = 3;

        System.out.println(ways(total, k));
    }
}
