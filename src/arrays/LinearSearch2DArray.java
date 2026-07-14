package arrays;

import java.util.Scanner;

public class LinearSearch2DArray {
    static int[] search(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of 2D Array");
        int row = scan.nextInt();
        int col = scan.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter Rows and Columns");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter the target value to search");
        int target = scan.nextInt();

        System.out.println("---------------------");

        int[] ans = search(arr, target);
        System.out.println(ans[0] + " " + ans[1]);

        System.out.println("---------------------");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
