package mathematics;

public class totalMovesForBishop {

    //  bruteforce solution
    public static int findTotalMoves(int a, int b) {
        int moves = 0;
        int i = a;
        int j = b;

        while (a > 1 && b > 1) {
            moves++;
            a--;
            b--;
        }

        a = i;
        b = j;
        while (a < 8 && b < 8) {
            moves++;
            a++;
            b++;
        }

        a = i;
        b = j;
        while (a > 1 && b < 8) {
            moves++;
            a--;
            b++;
        }

        a = i;
        b = j;
        while (a < 8 && b > 1) {
            moves++;
            a++;
            b--;
        }

        return moves;
    }

    //  optimised solution
    //  divide the grid into 4 rectangles: (A-1 * B-1), (A-1 * 8-B), (8-B * B-1), (8-A * 8-B)
    //  Length of diagonal of a grid = Min(row, column)
    public static int moves(int a, int b) {
        return Math.min(a - 1, b - 1) + Math.min(a - 1, 8 - b) + Math.min(8 - a, b - 1) + Math.min(8 - a, 8 - b);
    }

    public static void main(String[] args) {
        System.out.println(moves(3, 4));
    }
}
