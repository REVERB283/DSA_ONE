package mathematics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class sumOfPairwiseHammingDistance {

    public static int hammingDistance(final List<Integer> A) {
        long result = 0;
        long mod = 1000000007;

        for (int i = 0; i < 32; i++) {
            int zeroes = 0;
            int ones = 0;
            for (int j = 0; j < A.size(); j++) {
                if (((1 << i) & A.get(j)) != 0)
                    ones++;
                else
                    zeroes++;
            }

            result = (result + (2 * ones * zeroes) % mod) % mod;
        }

        return (int) result;
    }

    public static int findDifferentBits(int a, int b) {
        int xor = a ^ b;
        int count = 0;

        while (xor != 0) {
            xor = xor & (xor - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(96);
        list.add(96);
        list.add(7);
        list.add(81);
        list.add(2);
        list.add(13);

        System.out.println(hammingDistance(list));
    }
}
