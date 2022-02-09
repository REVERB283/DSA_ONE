package mathematics;

public class distributeInCircle {

    //  a: total items
    //  b: no. of positions in a circle
    //  c: starting position
    //  start from c and find the position to get the last item
    public static int findPosition(int a, int b, int c) {
        return (c - 1 + a) % b;
    }

    public static void main(String[] args) {
        System.out.println(findPosition(8,5,2));
    }
}
