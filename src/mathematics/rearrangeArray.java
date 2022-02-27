package mathematics;

import java.util.ArrayList;
import java.util.Arrays;

public class rearrangeArray {

    public static void arrange(ArrayList<Integer> a) {
        int n = a.size();

        for (int i = 0; i < n; i++) {
            int x = a.get(i);
            int y = a.get(x) % n;
            a.set(i, x + n * y);
        }

        for (int i = 0; i < n; i++) {
            a.set(i, a.get(i) / n);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList( 2, 1, 3, 0));
        arrange(arr);
        System.out.println(arr.toString());
    }
}
