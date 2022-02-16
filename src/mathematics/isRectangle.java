package mathematics;

public class isRectangle {

    public static int isRectangle(int A, int B, int C, int D) {
        return (A == B && C == D || A == C && B == D || A == D && B == C) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isRectangle(1, 1, 2, 2));
        System.out.println(isRectangle(1, 2, 3, 4));
    }
}
