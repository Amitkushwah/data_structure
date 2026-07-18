package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTrianglePrintRow {
    static long nCr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    static void printPascalTriangleRowBruteForce(int n) {
        for (int c = 1; c <= n; c++) {
            System.out.println(nCr(n - 1, c - 1));
        }
    }

    public static void main(String[] args) {
        printPascalTriangleRowBruteForce(4);
    }
}
