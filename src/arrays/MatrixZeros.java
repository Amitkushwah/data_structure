package arrays;

public class MatrixZeros {
    static void setMatrixZeros(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    for (int col = 0; col < m; col++)
                        if (arr[i][col] != 0)
                            arr[i][col] = -1;
                    for (int row = 0; row < n; row++)
                        if (arr[row][j] != 0)
                            arr[row][j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == -1)
                    arr[i][j] = 0;
            }
        }
    }

    static void setMatrixZerosBetter(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || col[j]) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    static void setMatrixZerosOptimal(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int col0 = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    if (j != 0)
                        arr[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[0][j] == 0 || arr[i][0] == 0)
                    arr[i][j] = 0;
            }
        }
        if (arr[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                arr[0][j] = 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.println("--------------");

//        setMatrixZeros(matrix);
//        setMatrixZerosBetter(matrix);
        setMatrixZerosOptimal(matrix);

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
