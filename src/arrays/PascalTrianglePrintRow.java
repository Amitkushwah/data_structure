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

    static List<Long> printRow(int n) {
        List<Long> ans = new ArrayList<>();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                ans.add(nCr(row - 1, col - 1));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Long> ans = printRow(3);
        ans.forEach(System.out::println);
    }
}
