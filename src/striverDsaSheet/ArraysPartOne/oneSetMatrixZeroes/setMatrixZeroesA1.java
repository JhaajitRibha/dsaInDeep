package striverDsaSheet.ArraysPartOne.oneSetMatrixZeroes;

import java.util.Arrays;

public class setMatrixZeroesA1 {
    public void setZeroes(int[][] matrix) {
        int[][] matrixTemp = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrixTemp[i][j]=matrix[i][j];
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    putZeroes(i,j,matrixTemp);
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=matrixTemp[i][j];
            }
        }
    }

    public void putZeroes(int y,int z,int[][] matrixTemp){
        for(int i=0;i<matrixTemp.length;i++){
            matrixTemp[i][z]=0;
        }
        for(int j=0;j<matrixTemp[0].length;j++){
            matrixTemp[y][j]=0;
        }
    }

    public static void main(String[] args) {

        int[][] b = {{0,1}};
        int[][] c = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] a = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        Arrays.stream(a).forEach(x-> System.out.println(Arrays.toString(x)));
        new setMatrixZeroesA1().setZeroes(a);
        System.out.println();
        System.out.println();
        Arrays.stream(a).forEach(x-> System.out.println(Arrays.toString(x)));
    }
}
