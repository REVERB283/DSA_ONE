package arrays;

public class maxSumSubarray {

    //  kadane's algo
    public static int maxSubarraySum(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE, curSum = 0;
        for (int i = 0; i < n; i++) {
            curSum += arr[i];

            if (curSum > maxSum)
                maxSum = curSum;

            if (curSum < 0) {
                curSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4};
        int n = arr.length;
        System.out.println(maxSubarraySum(arr, n));
    }
}
