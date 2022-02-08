package arrays;

public class minimumJumpsToEnd {

    public static int minJumps(int[] arr) {
        int curReach = 0, maxReach = 0, jumps = 0;

        if (arr[0] == 0)
            return -1;

        for (int i = 0; i < arr.length - 1; i++) {
            maxReach = Math.max(maxReach, i + arr[i]);

            if (maxReach >= arr.length - 1) {
                jumps++;
                return jumps;
            }

            if (i == curReach) {
                curReach = maxReach;
                jumps++;
            }

        }

        return curReach >= arr.length - 1 ? jumps : -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        System.out.println(minJumps(arr));
    }
}
