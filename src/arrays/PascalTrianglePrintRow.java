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
            System.out.print(nCr(n - 1, c - 1) + " ");
        }
    }

    static void printPascalTriangleRowOptimal(int n){
        int res = 1;
        System.out.print(res + " ");
        for(int c = 1; c < n; c++){
            res = res * (n - c);
            res = res / c;
            System.out.print(res + " ");
        }
    }

    public static void main(String[] args) {
        int row = 4;
        printPascalTriangleRowBruteForce(row);
        System.out.println();
        printPascalTriangleRowOptimal(row);
    }
}
