package mathematics;

import java.util.ArrayList;

public class fizzBuzz {

    private static ArrayList<String> printFizzBuzz(int A) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 1; i <= A; i++) {
            if (i % 3 == 0 && i % 5 == 0) result.add("FizzBuzz");
            else if (i % 3 == 0) result.add("Fizz");
            else if (i % 5 == 0) result.add("Buzz");
            else result.add(Integer.toString(i));
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(printFizzBuzz(20).toString());
    }

}
