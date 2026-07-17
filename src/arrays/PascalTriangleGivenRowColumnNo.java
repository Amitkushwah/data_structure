package arrays;

public class PascalTriangleGivenRowColumnNo {
    static long nCR(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int r = 8, c = 3;
        System.out.println(nCR(r-1, c-1));
    }
}
