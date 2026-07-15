package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> spiralMatrix(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;
        List<Integer> ans = new ArrayList<>();

        while (left <= right && top <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        List<Integer> ans = spiralMatrix(matrix);

        System.out.println(ans);
    }
}
