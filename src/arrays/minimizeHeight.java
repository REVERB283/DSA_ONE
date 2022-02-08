package arrays;

import java.util.Arrays;

public class minimizeHeight {

    public static int getMinDiff(int[] arr, int n, int k) {
        int min, max;

        Arrays.sort(arr);

        int result = arr[n - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            min = Math.min(smallest, arr[i + 1] - k);
            max = Math.max(largest, arr[i] + k);

            if (min < 0) {
                continue;
            }

            result = Math.min(result, max - min);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int n = arr.length;
        int k = 5;

        System.out.println(getMinDiff(arr, n, k));
    }

}
