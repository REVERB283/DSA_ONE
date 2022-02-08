package arrays;

import java.awt.font.TextLayout;
import java.util.Arrays;

public class mergeWithoutExtraSpace {

    public static void merge(int[] arr1, int[] arr2, int n, int m) {
        int i, j;
        int interval = n + m;

        //  to iterate over the n + m array
        for (interval = calculateInterval(interval); interval > 0; interval = calculateInterval(interval)) {
            //  this will iterate over arr1 in interval
            for (i = 0; i + interval < n; i++) {
                if (arr1[i] > arr1[i + interval])
                    swap(arr1, i, arr1, i + interval);      //  swap when (i)th element is greater than (i+interval)th
            }

            //  this will iterate over arr1 & arr2 in interval
            for (j = interval > n ? interval - n : 0; i < n && j < m; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    swap(arr1, i, arr2, j);                     //  swap when (i)th element is greater than (j)th
                }
            }

            if (j < m) {
                //  this will iterate over arr2
                for (j = 0; j + interval < m; j++) {
                    if (arr1[j] > arr2[j + interval])
                        swap(arr2, j, arr2, j + interval);      //  swap when (ji)th element is greater than (j+interval)th
                }
            }

//            System.out.println(Arrays.toString(arr1));
//            System.out.println(Arrays.toString(arr2));
        }
    }

    public static int calculateInterval(int n) {
        if (n <= 1) return 0;
        return (n / 2) + (n % 2);
    }

    public static void swap(int[] arr1, int l, int[] arr2, int r) {
        int temp = arr1[l];
        arr1[l] = arr2[r];
        arr2[r] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        int n = arr1.length;
        int m = arr2.length;

        merge(arr1, arr2, n, m);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
