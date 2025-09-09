package striverDsaSheet.ArraysPartTwo.RotateMatrix;

public class RotateMatrixA2 {
    public void rotate(int[][] matrix) {
        int temp=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i<j){
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length/2;j++){
             temp=matrix[i][j];
             matrix[i][j]=matrix[i][matrix[i].length-1-j];
             matrix[i][matrix[i].length-1-j]=temp;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        new RotateMatrixA2().rotate(matrix);

    }
}
