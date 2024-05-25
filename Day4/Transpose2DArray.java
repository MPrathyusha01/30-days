package Day4;

import java.util.Arrays;

public class Transpose2DArray {
    public static void main(String args[]){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int rowLen = arr.length;
        int colLen = arr[0].length;
        int[][] newMat = new int[rowLen][colLen];

        for(int row = 0; row<rowLen; row++){
            for(int col = 0; col<colLen;col++){
                newMat[row][col] = arr[col][row];
            }
        }

        System.out.println(Arrays.deepToString(newMat));
    }
}
