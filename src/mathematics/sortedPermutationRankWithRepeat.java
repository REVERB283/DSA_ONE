package mathematics;

import java.util.Arrays;

public class sortedPermutationRankWithRepeat {
    private static final int M = 1000003;

    public static int findRank(String a) {
        int n = a.length();
        long[] facts = new long[n + 1];
        long[] infacts = new long[n + 1];
        facts[0] = infacts[0] = 1;

        calculateFactorial(facts, infacts);

        int[] c = new int[52];
        for (char ch : a.toCharArray()) {
            c[o(ch)]++;
        }

        System.out.println(Arrays.toString(c));

        long rank = 0;
        int count = a.length();
        for (char ch : a.toCharArray()) {
            count--;
            for (int t = 0; t < o(ch); t++) {
                System.out.println(t + " " + o(ch) + " " + ch);
                if (c[t] > 0) {
                    c[t]--;
                    long trank = facts[count];
                    //System.out.println("t" + trank);
                    for (int i = 0; i < 52; i++) {
                        if (c[i] > 0) {
                            trank = (trank * infacts[c[i]]) % M;
                            //System.out.println("t" + trank);
                        }
                    }
                    rank = (rank + trank) % M;
                    //System.out.println("r" + rank);
                    c[t]++;
                }
            }
            c[o(ch)]--;
        }
        return new Long((rank + 1) % M).intValue();
    }

    private static int o(char ch) {
        if (ch <= 'Z') return ch - 'A';
        return ch - 'a' + 26;
    }

    public static long binaryExponentiation(long a, long b) {
        long result = 1;

        while (b != 0) {
            if ((b & 1) != 0)
                result = (result * (a % M)) % M;

            a = ((a % M) * (a % M)) % M;
            b >>= 1;
        }
        return result;
    }

    public static void calculateFactorial(long[] fact, long[] infact) {
        fact[0] = infact[0] = 1;

        for (int i = 1; i < fact.length; i++) {
            fact[i] = (fact[i - 1] * i) % M;
            infact[i] = binaryExponentiation(fact[i], M - 2);
        }
    }

    public static void main(String[] args) {
//        System.out.println(findRank("MTrsfRcPnqhTOpMiTlgxtNePVPsvzONuzpQhCVUEdbXXZRygRASyvlaYlyXQzlLKIcoudZSQGNDimOiLZnthPlEAyPJSxPbUEWyJmYaGwxeCdVMGHVdaSqWBxddneOFdvesReQJPwgWvWsRpKCNLxCojQaGeZnTFcMekFcyNGtxXrOuODPJYqBkmKSoFmvocVTWBSdeaadDCpFArGwvtyTITGOoVNTGifHRDcBGqVUxOCdpYieKPNObMUchYCdbcgDDTKEycRaJPIfzJFxTeLUBGYccIVviXifAUFuBwtmuuDkbUhiqnmahEldaHhupOJUokLOztOECPgVSgxqqsSWgovSGVnkELsygdoeUIgoIguZqAbeHFwuphiaDdGRjNnleusCvXuQCBjfADGwpzgwNxWFqciJGkOIwpf"));
        System.out.println(findRank("GOOGLE"));
    }
}