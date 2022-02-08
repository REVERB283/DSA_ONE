package arrays;

import java.util.Arrays;
import java.util.Random;

public class kthSmallestElement {

    //  to find out the kth smallest number: (k-1) for kth smallest & (n-k) for kth largest
    public static int quickSelect(int[] arr, int l, int r, int k) {
        Random rand = new Random(0);     // to randomise the pivot selection

        while (l <= r) {
            int randomPivot = rand.nextInt(r - l + 1) + l;      // random pivot index
            int result = partition(arr, l, r, randomPivot);
            System.out.println("RandomPivot: " + randomPivot + " Index: " + result + " Array: " + Arrays.toString(arr));

            if (result == k - 1)        //  result matches k-1, return arr[result]
                return arr[result];
            else if (result > k - 1)    //  look in the left-part of array
                r = result - 1;
            else                        //  look in the right-part of array
                l = result + 1;
        }

        return -1;
    }

    //  to return the index of the pivot location (sorted)
    public static int partition(int[] arr, int l, int r, int randomPivot) {
        int pivot = arr[randomPivot];
        int low = l;

        swap(arr, randomPivot, r);

        for (int i = l; i < r; i++) {
            if (arr[i] < pivot) {       //  ith element is smaller than pivot, swap low with ith element
                swap(arr, low, i);
                low++;
            }
        }

        swap(arr, low, r);

        return low;
    }

    //  to swap the two numbers
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int n = arr.length;
        int k = 2;
        System.out.println(quickSelect(arr, 0, n - 1, k));
    }
}
