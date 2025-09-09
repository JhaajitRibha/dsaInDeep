package striverDsaSheet.ArraysPartTwo.RotateMatrix;

public class RotateMatrixA1 {
    public void rotate(int[][] matrix) {
        int[][] matrix2 = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix2[i][j] = matrix[matrix.length-1-j][i];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=matrix2[i][j];
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        new RotateMatrixA1().rotate(matrix);

    }
}
