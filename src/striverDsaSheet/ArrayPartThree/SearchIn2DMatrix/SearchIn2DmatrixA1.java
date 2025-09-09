package striverDsaSheet.ArrayPartThree.SearchIn2DMatrix;

public class SearchIn2DmatrixA1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=matrix.length*matrix[0].length-1;
        return searchMatrix(matrix,target,low,high);

    }

    public boolean searchMatrix(int[][] matrix, int k, int low, int high) {
        if (low > high) {
            return false;
        }
        int mid = low + (high - low) / 2;
        int row=mid/matrix[0].length;
        int col= mid% matrix[0].length;

        if (k == matrix[row][col]) {
            return true;
        } else if (k > matrix[row][col]) {
            return searchMatrix(matrix, k, mid + 1, high);
        } else {
            return searchMatrix(matrix, k, low, mid - 1);
        }
    }


    public static void main(String[] args) {
        int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] matrix2={{1,1}};
        int target=3;
        System.out.println(new SearchIn2DmatrixA1().searchMatrix(matrix,target));
    }
}
