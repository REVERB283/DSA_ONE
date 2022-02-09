package mathematics;

import java.util.ArrayList;
import java.util.Arrays;

public class primeSum {

    public static ArrayList<Integer> findPrimeSum(int a) {
        ArrayList<Integer> pSum = new ArrayList<Integer>();
        boolean[] primeNos = seiveOfEratosthenes.findPrime(a);

        for (int i = 2; i <= a; i++) {
            if (primeNos[i] == true && primeNos[a - i] == true) {
                pSum.add(i);
                pSum.add(a - i);
            }
        }

        ArrayList<Integer> temp = new ArrayList<>(pSum.subList(0, 2));

        return temp;
    }

    public static void main(String[] args) {
        System.out.println(findPrimeSum(1048574));
    }
}
