package mathematics;

import java.util.Arrays;

public class gridUniquePaths {

    //  brute force approach
    public static int uniquePaths(int A, int B) {
        if (A == 1 || B == 1) return 1;
        return uniquePaths(A - 1, B) + uniquePaths(A, B - 1);
    }

    //  Dynamic Programming approach
    public static int uniquePaths2(int A, int B) {
        int[][] dp = new int[A][B];
        for (int[] row : dp) Arrays.fill(row, -1);

        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                if (i == 0 || j == 0) dp[i][j] = 1;
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[A - 1][B - 1];
    }

    //  combinatorics approach
    public static int uniquePaths3(int A, int B) {
        int N = A + B - 2;
        int r = A - 1;
        double result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (N - r + i) / i;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(15, 9));             // brute-force

        System.out.println(uniquePaths2(15, 9));            // dp

        System.out.println(uniquePaths3(15, 9));            // combination
    }
}
