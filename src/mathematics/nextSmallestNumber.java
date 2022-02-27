package mathematics;

import java.util.Arrays;

public class nextSmallestNumber {

    public static String findNumber(String A) {
        char[] result = A.toCharArray();
        int n = A.length();
        int i;

        for (i = n - 2; i >= 0; i--) {
            if (result[i] < result[i + 1]) break;
        }

        if (i >= 0) {
            int j = n - 1;
            for (j = n - 1; j > i; j--) {
                if (result[j] > result[i]) break;
            }

            swap(result, i, j);
            Arrays.sort(result, i + 1, n);
        } else return String.valueOf(-1);

        return new String(result);
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(findNumber("83124"));
    }
}
