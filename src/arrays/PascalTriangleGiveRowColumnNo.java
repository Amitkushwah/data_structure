package arrays;

public class PascalTriangleGiveRowColumnNo {
    static long nCR(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int r1 = 8, c1 = 3;
        int r2 = 5, c2 = 3;
        System.out.println(nCR(r1-1, c1-1));
        System.out.println(nCR(r2-1, c2-1));
    }
}
