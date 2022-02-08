package arrays;

import java.util.Arrays;

public class sort012 {

    //  to sort the array that contains only 0s, 1s, 2s
    public static void toSort012(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0 -> {
                    swap(arr, low, mid);
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                case 2 -> {
                    swap(arr, high, mid);
                    high--;
                }
            }
        }
    }

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        int n = arr.length;
        toSort012(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
