package mathematics;

public class euclidGcd {

    public static int findEuclidGcd(int a, int b) {
        return a % b == 0 ? b : findEuclidGcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(findEuclidGcd(78, 24));
    }
}
