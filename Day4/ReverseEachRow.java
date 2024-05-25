package Day4;

import java.util.Arrays;

public class ReverseEachRow {
    public static void main(String args[]) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int rowLen = arr.length;
        int colLen = arr[0].length;
        int temp = 0;

        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen / 2; col++) {
                temp = arr[row][col];
                arr[row][col] = arr[row][colLen - col - 1] ;
                arr[row][colLen - col - 1] = temp;
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
