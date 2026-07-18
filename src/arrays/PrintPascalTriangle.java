package arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintPascalTriangle {
    static long nCr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    static List<List<Long>> printPascalTriangleBruteForce(int n) {
        List<List<Long>> ans = new ArrayList<>();
        for (int r = 1; r <= n; r++) {
            List<Long> rowList = new ArrayList<>();
            for (int c = 1; c <= r; c++) {
                rowList.add(nCr(r - 1, c - 1));
            }
            ans.add(rowList);
        }
        return ans;
    }

    static List<Long> printPascalTriangleRow(int n) {
        long res = 1;
        List<Long> ans = new ArrayList<>();
        ans.add(res);
        for (int c = 1; c < n; c++) {
            res = res * (n - c);
            res = res / c;
            ans.add(res);
        }
        return ans;
    }

    static List<List<Long>> printPascalTriangleOptimal(int n) {
        List<List<Long>> ansRow = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ansRow.add(printPascalTriangleRow(i));
        }
        return ansRow;
    }

    public static void main(String[] args) {
        int row = 5;
        List<List<Long>> ans = printPascalTriangleBruteForce(row);
        ans.forEach(System.out::println);
        System.out.println("---------------");
        List<List<Long>> ansOptimal = printPascalTriangleOptimal(row);
        ansOptimal.forEach(System.out::println);
    }
}
