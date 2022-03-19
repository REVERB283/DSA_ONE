package mathematics;

import java.util.Arrays;

public class sortedPermutaionRank {

    public static int calculateRank(String A) {
//        A = A.toLowerCase();
        if (A.length() == 1) return 1;

        int N = A.length();
        long[] fact = new long[N];

        factorial(fact);

        char[] carr = A.toCharArray();
        int[] iarr = new int[256];
        long result = 0;

        Arrays.sort(carr);
        System.out.println(Arrays.toString(carr));
        Arrays.fill(iarr, 0);

        for (int i = 0; i < N; i++) {
            int smallerNos = 0;

            for (int j = 0; j < N; j++) {
                if (A.charAt(i) == carr[j]) break;

                if (iarr[carr[j]] == 0) smallerNos++;
            }

            iarr[A.charAt(i)] = 1;
            result += (smallerNos * fact[N - i - 1]);
        }

        return (int) ((result + 1) % 1000003);
    }

    public static void factorial(long[] fact) {
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i < fact.length; i++)
            fact[i] = (fact[i - 1] * i) % 1000003;
    }

    public static void main(String[] args) {
//        System.out.println(calculateRank("ibytes")); //263
        System.out.println(calculateRank("gTFAMYjxCewRlftmGOKJHUuhSBVDZnbqyoPQadEkLrpNsv")); //569228
//        System.out.println(calculateRank("DTNGJPURFHYEW"));  //342501
    }

}
