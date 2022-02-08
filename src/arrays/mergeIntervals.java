package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class mergeIntervals {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> result = new LinkedList<>();

        for (int[] interval : intervals) {
            if (result.isEmpty() || interval[0] > result.getLast()[1])
                result.add(interval);
            else {
                result.getLast()[0] = Math.min(result.getLast()[0], interval[0]);
                result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][2]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(intervals));
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
