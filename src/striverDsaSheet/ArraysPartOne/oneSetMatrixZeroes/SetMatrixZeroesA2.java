package striverDsaSheet.ArraysPartOne.oneSetMatrixZeroes;

import java.util.Arrays;

public class SetMatrixZeroesA2 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean rowZero = false;
        boolean colZero = false;


        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                rowZero = true;
                break;
            }
        }


        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                colZero = true;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (rowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }


        if (colZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }


    public static void main(String[] args) {

        int[][] b = {{0, 1}};
        int[][] c = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] d = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] a = {
                {0, 2, 3, 4},
                {5, 6, 0, 8},
                {9, 10, 11, 12},
                {0, 14, 15, 16}
        };
        Arrays.stream(a).forEach(x -> System.out.println(Arrays.toString(x)));
        new SetMatrixZeroesA2().setZeroes(a);
        System.out.println();
        System.out.println();
        Arrays.stream(a).forEach(x -> System.out.println(Arrays.toString(x)));
    }
}
