package arrays;

public class RotateMatrix90 {
    static int[][] rotate90(int[][] arr) {
        int n = arr.length;
        int[][] ans = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                ans[j][n - 1 - i] = arr[i][j];
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.println("--------------");

        int[][] ans = rotate90(matrix);

        for (int[] row : ans) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
